package cn.edu.thread.communication01;

public class WaiterTest {
	public static void main(String[] args) {
        Thread waiter = new Thread(new Waiter());
        waiter.start();
        for(int i=0;i<3;i++){
        	Thread customer = new Thread(new Customer());
        	customer.start();
        }
        System.out.println("end");
	}

}
