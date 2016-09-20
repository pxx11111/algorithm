package cn.edu.thread.priority;

public class DecRunnable implements Runnable {
	private static int no = 1;
	 private final int threadNo = no++;
	@Override
	public void run() {
       int i=0;
       while(i<1000){
       	PriorityTest.COUNT--;
       	i++;
       }
       System.out.println("DEC threadNo:" + threadNo + ",count=" + PriorityTest.COUNT);
	}


}
