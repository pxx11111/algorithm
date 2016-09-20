package cn.edu.thread.communication02;

public class WaiterTest {

	public static void main(String[] args) {
	    Waiter waiter =	new Waiter();
		Thread waiterThread = new Thread(waiter);
        waiterThread.start();
        for(int i=0;i<3;i++){
        	Customer customer = new Customer();
        	waiter.add(customer);
        	Thread customerThread = new Thread(customer);
        	customerThread.start();
        }
        System.out.println("end");
	}

}
