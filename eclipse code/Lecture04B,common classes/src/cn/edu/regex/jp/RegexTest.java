package cn.edu.regex.jp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*String str = "1234567890";
		boolean flag = true;
		char c[] = str.toCharArray();
		for(int i=0;i<c.length;i++){
			if(c[i]<'0'||c[i]>'9'){
				flag = false;
				break;
			}
		}
        if(flag)
        	System.out.println("is digit!");
        else
        	System.out.println("is not digit!");*/
		
		/*String str = "1234567890";
		if(Pattern.compile("[0-9]+").matcher(str).matches())
			System.out.println("is digit!");
		else
			System.out.println("is not digit!");*/
		
		/*String str = "2013-05-01";
		String pat = "\\d{4}-\\d{2}-\\d{2}";
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(str);
		
		if(m.matches()){
			System.out.println("date is valid!");
		}*/
		
		/*String str = "A1B22CC33DDDD5555EEE666FFF";
		String pat = "\\d+";
		
		Pattern p = Pattern.compile(pat);
		String s[] = p.split(str);
		
		for(int i=0;i<s.length;i++){
			System.out.println(s[i] + "\t");
		}*/
		
		/*String str = "LXH:98|MSDN:90|LI:99";
		String sArray[] = str.split("\\|");
		System.out.println("result:");
		for(String s:sArray){
			String s2[] = s.split(":");
			System.out.println(s2[0] + "\t" + s2[1]);
		}*/
		
		
		p("fgh".matches("[a-z]{3}"));
		p("192.168.0.0".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
		p("A".matches("[a-zA-Z]]+"));
		p("A".matches("[a-z]|[A-Z]+"));
		p("A".matches("[a-z[A-Z]]+"));
		
	}

	private static void p(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj);
	}
     
}
