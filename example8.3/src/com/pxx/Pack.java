package com.pxx;

import java.util.Scanner;

public class Pack {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[]ch=str.toCharArray();
		int n=sc.nextInt();
		int m=sc.nextInt();
		Pack pa=new Pack();
		pa.Result(ch,n,m);
		String str1=new String(ch);
		System.out.println(str1);
	}
	public  void Result(char[]s,int n,int m) {
		m%=n;
		ReverseString(s,0,m-1);
		ReverseString(s,m,n-1);
		ReverseString(s,0,n-1);
	}
	public  void ReverseString(char[]s,int from,int to)
	{
		while(from<to)
		{
			char t=s[from];
			s[from++]=s[to];
			s[to--]=t;
		}
	}

}
