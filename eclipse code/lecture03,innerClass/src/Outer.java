public class Outer{ 
	private int size;
	/** �����ڲ���Inner */
	public class Inner{ 
		private int size=1;
		public void doStuff(int size){ 
			size++; //��ȡ�ֲ�����
			this.size++;  //��ȡ�ڲ���ĳ�Ա����
			Outer.this.size++; //��ȡ�������Outer�ĳ�Ա����
			System.out.println("size in Inner.doStuff(): "+size);
			System.out.println("size of the Inner class: "+this.size);
			System.out.println("size of the Outer class:  "+Outer.this.size);
		}
	}
	Inner i=new Inner(); //��Ա����iָ��Inner��Ķ���
	
	public void increaseSize(int s){ 
		i.doStuff(s); //�����ڲ���Inner�ķ���
	}
	public static void main(String[] a){ 
		Outer o=new Outer();	
		o.increaseSize(10);
	}
}
