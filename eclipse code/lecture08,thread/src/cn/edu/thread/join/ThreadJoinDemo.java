package cn.edu.thread.join;
class MyThread implements Runnable{	// ʵ��Runnable�ӿ�
	public void run(){	// ��дrun()����
		for(int i=0;i<50;i++){
			System.out.println(Thread.currentThread().getName()
				+ "���У�i = " + i) ;	// ȡ�õ�ǰ�̵߳�����
		}
	}
};
public class ThreadJoinDemo{
	public static void main(String args[]){
		MyThread mt = new MyThread() ;	// ʵ����Runnable�������
		Thread t = new Thread(mt,"�߳�");	// ʵ����Thread����
		t.start() ;	// �����߳�
		for(int i=0;i<50;i++){
			if(i>10){
				try{
					t.join() ;	// �߳�ǿ������
				}catch(InterruptedException e){}
			}
			System.out.println("Main�߳����� --> " + i) ;
		}
	}
}
