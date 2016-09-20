package cn.edu.thread.cylicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTest2 {

	public static void main(String[] args) {
		//CyclicBarrier barrier = new CyclicBarrier(3);
		CyclicBarrier barrier = new CyclicBarrier(3,new Runnable(){
			@Override
			public void run() {
				System.out.println("������ϣ�����");
			}
			
		});

		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.submit(new Thread(new Travel(barrier, "1���ο�")));
		executor.submit(new Thread(new Travel(barrier, "2���ο�")));
		executor.submit(new Thread(new Travel(barrier, "3���ο�")));

		executor.shutdown();
	}
}

class Travel implements Runnable {
	// һ��ͬ�������࣬������һ���̻߳���ȴ���ֱ������ĳ���������ϵ� (common barrier point)
	private CyclicBarrier barrier;

	private String name;

	public Travel(CyclicBarrier barrier, String name) {
		super();
		this.barrier = barrier;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			// semaphore.acquire();
			System.out.println(Thread.currentThread().getName() + "��˾��������");
			
			barrier.await();
			Thread.sleep(2000);

			
			System.out.println(Thread.currentThread().getName() + "���ƹʾӼ���");
			
			barrier.await();
			//System.out.println(Thread.currentThread().getName() + "���ƹʾӲι���ϣ�������ȥ��ˮ����");
			Thread.sleep(2000);

			
			System.out.println(Thread.currentThread().getName() + "��ˮ������");
			System.out.println(Thread.currentThread().getName() 
					+ "��ˮ���ȴ�....׼���ؼ���");
			// semaphore.release();
			barrier.await();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
