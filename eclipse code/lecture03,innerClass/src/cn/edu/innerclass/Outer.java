package cn.edu.innerclass;
public class Outer{ 
	private int size=2;
	/** �����ڲ���Inner */
	public class Inner{ 
		//�������ĳ�Ա����size����
		public void doStuff(){ 
			size++;   
		}
	}
	Inner i=new Inner(); //��Ա����iָ��Inner��Ķ���	
	public void increaseSize(){ 
		i.doStuff(); //�����ڲ���Inner�ķ���
	}
	public static void main(String[] a){ 
		Outer o=new Outer();	
		for (int i = 0; i<4; i++){
		   o.increaseSize();
		   System.out.println("The value of size : "+o.size);
		}
	}
}
