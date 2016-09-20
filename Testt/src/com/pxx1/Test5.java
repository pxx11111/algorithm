package com.pxx1;

public class Test5 {
	public static void main(String[] args) {
		Test5 ts=new Test5();
	    Test5.Transform tr=ts.new Transform();
	    String str=new String("i am students");
	    System.out.println(tr.trans(str, str.length()));
	}
	class Transform {
	    public String trans(String s, int n) {
	            char[] in = s.toCharArray();
	            String[] words = s.split(" ");
	            String res = "";
	            if(in[in.length-1]==' ')
	                res += " ";
	            for (int i = words.length-1; i > -1; i--) {
	                char[] temp = words[i].toCharArray();
	                for (int j = 0; j < temp.length; j++) {
	                    if(String.valueOf(temp[j]).matches("[a-z]"))
	                        temp[j] -= 32;
	                    else
	                        temp[j] += 32;
	                    res += temp[j];
	                }
	                res += " ";
	            }
	            return res.substring(0, res.length()-1);
	    }
	}
}
