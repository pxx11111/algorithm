package cn.edu.thread.communication02;

import java.util.ArrayList;
import java.util.List;

public class Waiter implements Runnable {
    public static boolean BUSYING = true;
    private List<Customer> customerRunnables = new ArrayList<Customer>();
    
    public void add(Customer customerRunnable){
    	customerRunnables.add(customerRunnable);
    }
    
	@Override
	public void run() {
		try {
			System.out.println("Waiter is busying.");
			BUSYING = true;
			Thread.sleep(1000);
			BUSYING = false;
			System.out.println("Waiter finished.");
			notifyCustomer();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void notifyCustomer() {
		// TODO Auto-generated method stub
		for(Customer customerRunnable:customerRunnables){
			customerRunnable.wake();
		}
	}

}