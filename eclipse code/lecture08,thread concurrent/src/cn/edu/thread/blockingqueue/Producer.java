package cn.edu.thread.blockingqueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * �������߳�
 * 
 * @author 
 */
public class Producer implements Runnable {
 
    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }
 
    public void run() {
        String data = null;
        Random r = new Random();
 
        System.out.println("�����������̣߳�");
        try {
            while (isRunning) {
                System.out.println("������������...");
                Thread.sleep(r.nextInt(DEFAULT_RANGE_FOR_SLEEP));
 
                data = "data:" + count.incrementAndGet();
                System.out.println("�����ݣ�" + data + "�������...");
                if (!queue.offer(data, 2, TimeUnit.SECONDS)) {
                    System.out.println("��������ʧ�ܣ�" + data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        } finally {
            System.out.println("�˳��������̣߳�");
        }
    }
 
    public void stop() {
        isRunning = false;
    }
 
    private volatile boolean      isRunning               = true;
    private BlockingQueue queue;
    private static AtomicInteger  count                   = new AtomicInteger();
    private static final int      DEFAULT_RANGE_FOR_SLEEP = 1000;
 
}
