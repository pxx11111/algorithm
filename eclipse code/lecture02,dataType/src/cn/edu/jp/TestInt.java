package cn.edu.jp;

public class TestInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 *  byte范围：[-128,127]
		 *  short范围：[-2^15,(2^15)-1]
		 *  int范围：[,]
		 */
		/*byte buf = (byte) 127;
		System.out.println(buf);*/
		/**
		 * 进制转换问题
		 */
		int a = 10;
		int b = 010;
		int c = 0x10;
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		System.out.println(Integer.toBinaryString(a));//整型转换为二进制
		System.out.println(Integer.toOctalString(a));//整型转换为八进制
		System.out.println(Integer.toHexString(a+3));//整型转换为十六进制
		
		
		/**
		 * 类型转换
		 * 如果数据没有超出被赋值变量（byte/short/char)的范围，则自动转换
		 */
		byte buf1 = 100;
		int a1 = 10;
		long b1 =200;
		
		System.out.println("buf1:" + buf1);
		System.out.println("a1:" +a1);
		System.out.println("b1:" + b1);
		

	}

}
