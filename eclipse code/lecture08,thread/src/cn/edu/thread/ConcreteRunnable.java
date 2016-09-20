package cn.edu.thread;

public class ConcreteRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<1000;i++){
			try {
				Thread.sleep(1);
				System.out.println("runnable " + i + ",");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
