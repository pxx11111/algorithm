package cn.edu.thread.interrupt;

public class LoopRunnable implements Runnable {
	private static int no = 1;
	private final int threadNo = no++;
	@Override
	public void run() {
		int tag = 0;
		while(true){
			if(tag++>2)break;
			System.out.println(threadNo + ":begin");
			try {
				Thread.sleep(20000);
				return;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(Exception e){
				e.printStackTrace();
			}
			System.out.println(threadNo + ":end");
		}
	}

}
