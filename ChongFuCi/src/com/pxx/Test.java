package com.pxx;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		int n=8;
		String str="abababab";
	    long num=getLongest(n,str);
	    System.out.println(num);
	}
	    public static long getLongest(int n, String s) {
	        // write code here
	        if (s == null || s.length() <= 1)
	            return 0;
	 
	        long res = 0;
	        if(s.charAt(1)==s.charAt(0))
	            res++;
	        int[] len = new int[n];
	        for (int i = 1; i < n; i++) {    // 逐步扩大窗口，比较前后字符是否相等
	            for (int j = 1; j <= (i + 1) && (i + j) < n; j++) {
	                if (s.charAt(i + j) == s.charAt(j - 1))
	                    len[i+j] = i + 1;
	                else
	                    break;
	            }
	        }
	        for (int i : len)
	            res += i;
	        return res;
	    }
	}

