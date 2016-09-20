package com.pxx;

public class Test5 {
public static void main(String[] args) {
	boolean[] a=new boolean[10];
	for (boolean b : a) {
		b=true;
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
