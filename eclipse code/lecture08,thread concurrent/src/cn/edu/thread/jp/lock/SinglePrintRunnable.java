package cn.edu.thread.jp.lock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class SinglePrintRunnable implements Callable {
    private static int no = 1;
    private final int threadNo = no++;
    private static final ReentrantLock lock = new ReentrantLock();
    
    public static void print(int id){
    	try {
			lock.lock();
			System.out.println("threadNo:" + id + "ªÒµ√");
			Thread.sleep((int)Math.random()*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			System.out.println("threadNo:" + id + " Õ∑≈");
			lock.unlock();
		}
    }
	@Override
	public Object call() throws Exception {
		print(threadNo);
		return null;
	}

}
