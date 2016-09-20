package cn.edu.thread.jp.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReentrantLockTest {

	public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for(int i = 0;i<5;i++){
        	service.submit(new SinglePrintRunnable());
        }
        service.shutdown();
	}

}
