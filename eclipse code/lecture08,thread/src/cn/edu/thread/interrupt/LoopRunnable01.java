package cn.edu.thread.interrupt;

public class LoopRunnable01 implements Runnable {
	private static int no = 1;
	private final int threadNo = no++;
	@Override
	public void run() {
		while(!Thread.interrupted()){
			try {
				System.out.println(threadNo + ":begin");
				Thread.sleep(2000);
				System.out.println(threadNo + ":end");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
