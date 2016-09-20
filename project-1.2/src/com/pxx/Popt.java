package com.pxx;

import java.util.Scanner;

public class Popt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		System.out.println(StringContain(a,b));
	
		
	}
	public  static Boolean StringContain(String a,String b)
	{
	    int hash = 0;
	    char[]a1=a.toCharArray();
	    char[]b1=b.toCharArray();
	    for (int i = 0; i < a1.length; ++i)
	    {    
	        hash |= (1 << (a1[i] - 'A'));
	    }
	    for (int i = 0; i < b.length(); ++i)
	    {
	        if ((hash & (1 << (b1[i] - 'A'))) == 0)
	        {
	            return false;
	        }
	    }
	    return true;
	}

}
