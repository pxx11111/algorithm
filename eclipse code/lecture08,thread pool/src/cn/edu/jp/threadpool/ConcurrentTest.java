package cn.edu.jp.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentTest {

	public static void main(String[] args) {
		//�����޽��̳߳�
		//�̳߳ط�������runnable����ÿ���̶߳���ִ�л���
       /*ExecutorService cachedExec = Executors.newCachedThreadPool();
       for(int i = 0;i<3;i++){
    	   cachedExec.execute(new SingleRunnable());
       }
       cachedExec.shutdown();*/
       //���Թ̶���С�̳߳�
       /*ExecutorService fixedExec = Executors.newFixedThreadPool(2);
       for(int i = 0;i<2;i++){
    	   fixedExec.execute(new SingleRunnable());
       }
       fixedExec.shutdown();*/
       //���Ե�����̨�߳�
       ExecutorService singleExec = Executors.newSingleThreadExecutor();
       for(int i = 0;i<3;i++){
    	   singleExec.execute(new SingleRunnable());
       }
       singleExec.shutdown();
	}

}
