package cn.edu.thread;

public class ConcreteThread extends Thread {
	public void run(){
		for(int i=1;i<1000;i++){
			try {
				Thread.sleep(1);
				System.out.println("thread " + i + ",");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
