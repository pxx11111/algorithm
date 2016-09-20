package cn.edu.jp.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentTest {

	public static void main(String[] args) {
		//测试无界线程池
		//线程池放了三个runnable任务，每个线程都有执行机会
       /*ExecutorService cachedExec = Executors.newCachedThreadPool();
       for(int i = 0;i<3;i++){
    	   cachedExec.execute(new SingleRunnable());
       }
       cachedExec.shutdown();*/
       //测试固定大小线程池
       /*ExecutorService fixedExec = Executors.newFixedThreadPool(2);
       for(int i = 0;i<2;i++){
    	   fixedExec.execute(new SingleRunnable());
       }
       fixedExec.shutdown();*/
       //测试单个后台线程
       ExecutorService singleExec = Executors.newSingleThreadExecutor();
       for(int i = 0;i<3;i++){
    	   singleExec.execute(new SingleRunnable());
       }
       singleExec.shutdown();
	}

}
