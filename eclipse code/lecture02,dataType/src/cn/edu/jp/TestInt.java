package cn.edu.jp;

public class TestInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 *  byte��Χ��[-128,127]
		 *  short��Χ��[-2^15,(2^15)-1]
		 *  int��Χ��[,]
		 */
		/*byte buf = (byte) 127;
		System.out.println(buf);*/
		/**
		 * ����ת������
		 */
		int a = 10;
		int b = 010;
		int c = 0x10;
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		System.out.println(Integer.toBinaryString(a));//����ת��Ϊ������
		System.out.println(Integer.toOctalString(a));//����ת��Ϊ�˽���
		System.out.println(Integer.toHexString(a+3));//����ת��Ϊʮ������
		
		
		/**
		 * ����ת��
		 * �������û�г�������ֵ������byte/short/char)�ķ�Χ�����Զ�ת��
		 */
		byte buf1 = 100;
		int a1 = 10;
		long b1 =200;
		
		System.out.println("buf1:" + buf1);
		System.out.println("a1:" +a1);
		System.out.println("b1:" + b1);
		

	}

}
