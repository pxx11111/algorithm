package com.pxx;

public class HuiWenChuan {
	public static void main(String[] args) {
		String s1="fiataif";
		char[]s=s1.toCharArray();
		System.out.println(IsPalindrome(s, s.length));
	}
	static boolean IsPalindrome( char []s, int n) 
	{ 
		if (s == null || n < 1) 
		{ return false; } 
		char front, back; // 初始化头指针和尾指针 
		front = s[0]; back = s[ n - 1]; 
		while (front < back) 
		{ if (front != back) 
		{ return false; } 
		++front; --back; }
		return true; }
	}

