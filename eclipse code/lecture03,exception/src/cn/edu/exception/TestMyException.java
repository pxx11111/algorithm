package cn.edu.exception;


/**
 * 
 * @author Administrator
 *
 */
class MyException extends Exception {
	
	public MyException(){
		
	}
	
	public MyException(String message){
		super(message);
	}
	
}

public class TestMyException{
	void test()throws MyException{
		int i,j;
		i=1;j=-2;
		if(j<0)throw new MyException("除数不能小于0");
	}
	
	public static void main(String[] args) {
		try {
			new TestMyException().test();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
