package com.pxx;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     int n=sc.nextInt(); 
     for(int i=0;i<n;i++)
     {
      int p=sc.nextInt();
      int l=sc.nextInt();
      String re="";
      String s1=s.substring(p,p+l);
      for(int j=0;j<s1.length();j++)
      {   
    	 re=s1.charAt(j)+re;
    	   
      }
      s=s+re;
     }
     System.out.println(s);
	}

}
