package com.pxx;

public class ZuiChangHuiWenZiChuan {
public static void main(String[] args) {
	String str="ababtaba";
    char[]s=str.toCharArray();
	System.out.println(LongestPalindrome(s, s.length));
}
public static int LongestPalindrome( char []s, int n) 
{ 
	int i=0, j=0, max=0,c = 0; 
	if (s== null || n < 1) 
		return 0; 
	max = 0; 
	for (i = 0; i < n; ++i) 
	{ // i is the middle point of the palindrome  
		for (j = 0; (i - j >= 0) && (i + j < n); ++j){ // if the length of the palindrome is odd  
			if (s[i - j] != s[i + j]) 
				break; 
			c = j * 2 + 1; 
			} 
		if (c > max) 
			max = c;
		for (j = 0; (i - j >= 0) && (i + j + 1 < n); ++j){ // for the even case  
			if (s[i - j] != s[i + j + 1])
				break; 
			c = j * 2 + 2; 
			} 
		if (c > max) 
			max = c; 
		} 
	return max; 
	}
		
	}


