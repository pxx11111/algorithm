package cn.edu.thread.daemon;

public class DaemonRunnable implements Runnable {
	private static int no = 1;
	private final int threadNo = no++;
	
	@Override
	public void run() {
 		for(int i=0;i<5;i++){
 			System.out.println("threadNo=" + threadNo + ";index=" + i);
 		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		}
	}

}
