package com.pxx;

import java.math.BigInteger;

public class Test3 { 
	public static void main(String[] args) {
		for (int i = 0; i <100; i++) {
			System.out.println(fibonacci(i));
		}
	}
	public static   BigInteger fibonacci(int n) { 
		// 当输入非正整数的时候返回0 
		if (n <= 0) { return new BigInteger("0"); } 
		if (n == 1 || n == 2) { return new BigInteger("1"); }
		BigInteger prePre =new BigInteger("1") ;
		BigInteger pre =new BigInteger("1"); 
		BigInteger current =new BigInteger("2"); 
		for (int i = 3; i <= n ; i++) {
			
			current = prePre.add( pre); 
			prePre = pre; 
			pre = current; } 
		return current; }
		}
	

