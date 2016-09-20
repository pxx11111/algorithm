package cn.edu.thread.yield;

public class Client {

	public static void main(String[] args) {
      Thread oneThread = new Thread(new LoopRunnable(true));
      //Thread twoThread = new Thread(new LoopRunnable(false));
      Thread twoThread = new Thread(new LoopRunnable(true));
      oneThread.start();
      twoThread.start();
      System.out.println("====hello world====");
	}

}
