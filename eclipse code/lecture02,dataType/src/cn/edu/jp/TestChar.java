package cn.edu.jp;

public class TestChar {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		/**
		 *  字符型编码为unicode，范围：[0,65535]
		 */
		char c1 = 'a';
		char c2 = '中';
		
		System.out.println(c1);
		System.out.println(c2);
		/**
		 *  转义符
		 */
		System.out.println('\'');
		System.out.print('\t');
		System.out.println("end");
		/**
		 * 字符可以当数字
		 */
		char c3 = 'a';
		int i= c3 + 2;
		char c4 = (char) i;
		System.out.println(c3);
		System.out.println(i);
		System.out.println(c4);
		/**
		 * 循环打印a-z
		 */
		for(int k = 0;k<26;k++){
			char c5 = (char) (c3+k);
			System.out.print(c5);
		}
			
	}

}
