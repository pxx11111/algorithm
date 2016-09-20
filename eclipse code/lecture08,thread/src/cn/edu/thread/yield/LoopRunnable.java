package cn.edu.thread.yield;

public class LoopRunnable implements Runnable {

	private static int no = 1;
	private final int threadNo = no++;
	private boolean yield = true;
	
	
	public LoopRunnable(boolean yield) {
		super();
		this.yield = yield;
	}


	@Override
	public void run() {
      while(true){
    	  System.out.println(threadNo + ":hello world");
    	  if(yield){
    		  Thread.yield();
    	  }
      }
	}

}
