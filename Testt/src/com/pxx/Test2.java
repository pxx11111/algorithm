package com.pxx;

public class Test2 {
public static void main(String[] args) {
	String []a=new String[]{"pxx","err","opp"};
	boolean flag=false;
	String ss = null;
	for(int i=0;i<a.length;i++)
	{
		if(a[i].equals("op"))
		{
			flag=true;
			ss=a[i];
			
		}
		
	}
	if(flag){
	System.out.println("success");
	System.out.println(ss);
	}
	else{
		System.out.println("fail");
	}
}
}
