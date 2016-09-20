package cn.edu.thread.cylicbarrier;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTest {

    public static void main(String[] args) throws IOException, InterruptedException {
        CyclicBarrier barrier = new CyclicBarrier(3);

        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(new Thread(new Runner(barrier, "1��ѡ��")));
        executor.submit(new Thread(new Runner(barrier, "2��ѡ��")));
        executor.submit(new Thread(new Runner(barrier, "3��ѡ��")));

        executor.shutdown();
    }
}

class Runner implements Runnable {
    // һ��ͬ�������࣬������һ���̻߳���ȴ���ֱ������ĳ���������ϵ� (common barrier point)
    private CyclicBarrier barrier;

    private String name;

    public Runner(CyclicBarrier barrier, String name) {
        super();
        this.barrier = barrier;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000 * (new Random()).nextInt(8));
            System.out.println(name + " ׼������...");
            // barrier��await�����������в����߶��Ѿ��ڴ� barrier �ϵ��� await ����֮ǰ����һֱ�ȴ���
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println(name + " ���ܣ�");
    }
}