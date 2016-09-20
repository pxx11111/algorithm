package com.sogou;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	int c=sca.nextInt();
	int[] arr=new int[c];
	for (int i = 0; i < c; i++) {
		arr[i]=sca.nextInt();
				}
	int sum=0;
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = i; j < arr.length; j++) {
		sum+=count(arr[i],arr[j]);		}
       }
	System.out.println(sum);
}
	public static int count(int m,int n){
	int num=0;
	
	for (int i = m; i <= n; i++) {
		int count=0;
		for (int j = 2; j < i; j++) {
			
			if(i%j!=0)
			{ count++;	}    
		}
		if(count==(i-2))
		{num++;}
	}
	return num;
}
}
