package cn.edu.thread.synblock.jp.data;

public class MyThread implements Runnable {
    private int tickets = 5;
    
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			//synchronized (this) {
				sale();
			//}
		}

	}

	public synchronized void sale() {
		if (tickets > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Sell:tickets=" + tickets--);
		}
	}

}
