package cn.edu.thread;

public class Client {

	public static void main(String[] args) {
		Runnable concreteRunnable = new ConcreteRunnable(); 
		Thread threadByRunnable = new Thread(concreteRunnable);
		threadByRunnable.run();
		
		Thread concreteThread = new ConcreteThread();
		concreteThread.run();
		System.out.println("=====hello,world!=====");
	}

}
