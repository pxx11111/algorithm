package com.pxx;
public class Test4 
{
	public static void main(String[] args) {
	System.out.println(IsMatch("aa", "a"));
	System.out.println(IsMatch("aa","aa"));
	System.out.println(IsMatch("aaa","aa")); 
	System.out.println(IsMatch("aa", "a"));
	System.out.println(IsMatch("aa", ".")); 
	System.out.println(IsMatch("ab", ".")); 
	System.out.println(IsMatch("aab", "ca*b") );
}
	public static boolean IsMatch(String s, String p) 
	{ 
		if (p.length() == 0) 
			return s.length() == 0; 
		if (p.length() == 1) 
			return (s.length() == 1) && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'); 
		if (p.charAt(1) != '*') { if (s.length() == 0) 
			return false; 
		else 
			return (p.charAt(0) == s.charAt(0)|| p.charAt(0) == '.') && IsMatch(s.substring(1), p.substring(1)); 
		} else
		{ 
			while (s.length() > 0 && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.')) 
		{ 
				if (IsMatch(s, p.substring(2))) 
					return true; s = s.substring(1);
					} 
			return IsMatch(s, p.substring(2)); 
			
		} 
		} 
	}