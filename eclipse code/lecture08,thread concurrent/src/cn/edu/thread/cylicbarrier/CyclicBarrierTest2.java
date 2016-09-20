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
				System.out.println("集合完毕，出发");
			}
			
		});

		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.submit(new Thread(new Travel(barrier, "1号游客")));
		executor.submit(new Thread(new Travel(barrier, "2号游客")));
		executor.submit(new Thread(new Travel(barrier, "3号游客")));

		executor.shutdown();
	}
}

class Travel implements Runnable {
	// 一个同步辅助类，它允许一组线程互相等待，直到到达某个公共屏障点 (common barrier point)
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
			System.out.println(Thread.currentThread().getName() + "公司大厅集合");
			
			barrier.await();
			Thread.sleep(2000);

			
			System.out.println(Thread.currentThread().getName() + "陈云故居集合");
			
			barrier.await();
			//System.out.println(Thread.currentThread().getName() + "陈云故居参观完毕，出发，去淀水湖。");
			Thread.sleep(2000);

			
			System.out.println(Thread.currentThread().getName() + "淀水湖集合");
			System.out.println(Thread.currentThread().getName() 
					+ "淀水湖等待....准备回家了");
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
