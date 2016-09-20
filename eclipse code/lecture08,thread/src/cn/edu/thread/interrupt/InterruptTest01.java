package cn.edu.thread.interrupt;

import cn.edu.thread.innondaemon.DaemonRunnable;

public class InterruptTest01 {

	public static void main(String[] args) throws InterruptedException {
		Thread oneThread = new Thread(new LoopRunnable01());
        oneThread.start();
        Thread.sleep(2000);
        oneThread.interrupt();
        
        System.out.println("==hello,world==");
	}

}