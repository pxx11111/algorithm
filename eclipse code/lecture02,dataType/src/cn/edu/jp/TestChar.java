package cn.edu.jp;

public class TestChar {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		/**
		 *  �ַ��ͱ���Ϊunicode����Χ��[0,65535]
		 */
		char c1 = 'a';
		char c2 = '��';
		
		System.out.println(c1);
		System.out.println(c2);
		/**
		 *  ת���
		 */
		System.out.println('\'');
		System.out.print('\t');
		System.out.println("end");
		/**
		 * �ַ����Ե�����
		 */
		char c3 = 'a';
		int i= c3 + 2;
		char c4 = (char) i;
		System.out.println(c3);
		System.out.println(i);
		System.out.println(c4);
		/**
		 * ѭ����ӡa-z
		 */
		for(int k = 0;k<26;k++){
			char c5 = (char) (c3+k);
			System.out.print(c5);
		}
			
	}

}
