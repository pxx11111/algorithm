package cn.edu.thread.communication01;

public class Customer implements Runnable {
	private static int no = 1;
    private final int threadNo = no++;
	@Override
	public void run() {
       System.out.println("customer threadNo:" + threadNo);
	}

}
