package cn.edu.change;

public class ByteToChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "hello,world";
		//char[] c = new char[9];
		char[] c = new char[]{'C','h','i','n','a',' ',' ',' ',' ',' ',' '};
		//str.getChars(6, 11, c, 5);
		c = str.toCharArray();
        for(char buf:c)
        	System.out.print(buf + "");
	}
}
