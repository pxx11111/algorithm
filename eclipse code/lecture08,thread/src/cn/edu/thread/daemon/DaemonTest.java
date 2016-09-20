package cn.edu.thread.daemon;

public class DaemonTest {

	public static void main(String[] args) {
       Thread oneThread = new Thread(new DaemonRunnable());
       //oneThread.setDaemon(true);
       oneThread.setDaemon(false);
       oneThread.start();
       System.out.println("==hello world==");
	}

}
