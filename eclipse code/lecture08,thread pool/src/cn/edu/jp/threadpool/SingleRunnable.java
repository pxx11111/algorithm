package cn.edu.jp.threadpool;

public class SingleRunnable implements Runnable {
	private static int  no=1;
    private final int threadNo = no++;
	@Override
	public void run() {
        for(int i=0;i<3;i++) {
        	System.out.println("threadNo=" + threadNo + ";index=" + i 
        			+ "\ttime:" + System.currentTimeMillis());
        	try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}
}