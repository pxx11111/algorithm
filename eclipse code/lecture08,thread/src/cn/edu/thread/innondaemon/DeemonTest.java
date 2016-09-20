package cn.edu.thread.innondaemon;

public class DeemonTest {

	public static void main(String[] args) {
        Thread oneThread = new Thread(new DaemonRunnable(10));
         oneThread.setDaemon(true);
         oneThread.start();
        Thread twoThread = new Thread(new DaemonRunnable(5));
        twoThread.setDaemon(false);
        twoThread.start();
        System.out.println("==hello,world==");
	}

}
