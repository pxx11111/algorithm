package com.pxx;

import java.util.Scanner;

public class Test3 {
public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	while(sca.hasNext())
	{
		String str=sca.nextLine();
		String []arr=str.split(",");
		int []arr1=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i]=Integer.valueOf(arr[i]);
		}
		int max=0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i; j < arr1.length; j++) {
				max=Math.max(max,arr1[j]-arr1[i]);
			}
		}
		System.out.println(max);
	}
}
}
