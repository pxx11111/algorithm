package cn.edu.thread.innondaemon;

public class DaemonRunnable implements Runnable {
	private static int no = 1;
	private final int threadNo = no++;
	private int loopCount = 0;

	public DaemonRunnable(int loopCount) {
		super();
		this.loopCount = loopCount;
	}

 	@Override
	public void run() {
		for(int i=0;i<loopCount;i++){
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
