package cn.edu.thread.synblock.jp;

import cn.edu.thread.synblock.jp.data.MyThread;



public class SynTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		Thread t3 = new Thread(mt);
		t1.start();
		t2.start();
		t3.start();
	}

}
