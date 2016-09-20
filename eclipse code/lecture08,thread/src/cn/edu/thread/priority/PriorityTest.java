package cn.edu.thread.priority;

public class PriorityTest {

	public static int COUNT;

	public static void main(String[] args) {
         for(int i=0;i<1000;i++){
        	 Thread inc = new Thread(new IncRunnable());
        	 Thread dec = new Thread(new DecRunnable());
        	 /*inc.setPriority(Thread.MAX_PRIORITY);
        	 dec.setPriority(Thread.MIN_PRIORITY);*/
        	 inc.setPriority(Thread.MIN_PRIORITY);
        	 dec.setPriority(Thread.MAX_PRIORITY);
        	 inc.start();
        	 dec.start();
         }
         System.out.println("COUNT:" + COUNT);
	}

}
