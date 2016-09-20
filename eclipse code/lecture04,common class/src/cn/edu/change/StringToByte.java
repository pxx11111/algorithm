package cn.edu.change;

public class StringToByte{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "hello,world!";
		byte[] buffer = str.getBytes();
		for(byte b:buffer){
			System.out.println(b);
		}
	}
}
