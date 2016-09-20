package cn.edu.thread.communication02;

public class Customer implements Runnable {
    
	private static int no = 1;
    private final int threadNo = no++;
	@Override
	public void run() {
		synchronized(this){
			try {
				while(Waiter.BUSYING){
					wait();
				}
				Thread.sleep(100);
				System.out.println("customer threadNo:" + threadNo + 
						";time:" + System.currentTimeMillis());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public synchronized void wake(){
		notify();
	}
}
