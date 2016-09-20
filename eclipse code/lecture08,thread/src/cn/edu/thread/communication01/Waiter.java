package cn.edu.thread.communication01;

public class Waiter implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Waiter is busying.");
			Thread.sleep(1000);
			System.out.println("Waiter finished.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
