package cn.edu.split;

public class TestSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "boo:and:foo";
		String[] a = str.split(":", 2);
		String[] b = str.split(":", 5);
		String[] c = str.split(":", -2);
		String[] d = str.split("o", 5);
		String[] e = str.split("o", -2);
		String[] f = str.split("o", 0);
		String[] g = str.split("m", 0);
		for(String s:a)
		  System.out.println(s);
		for(String s:b)
			System.out.println(s);
		for(String s:c)
			System.out.println(s);
		for(String s:d)
		   System.out.println(s);
        System.out.println("end");
		for(String s:e)
			   System.out.println(s);
	        System.out.println("end");
		for(String s:f)
			   System.out.println(s);
	        System.out.println("end");
		for(String s:g)
			   System.out.println(s);
	        System.out.println("end");

	}

}
