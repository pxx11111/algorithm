package com.pxx20160806;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	int n=sca.nextInt();
	int[]rows=new int[n];
	int[]cols=new int[n];
	for (int i = 0; i <n; i++) {
		rows[i]=sca.nextInt();
	}
	for (int i = 0; i <n; i++) {
		cols[i]=sca.nextInt();
	}
	System.out.println(count(rows,cols));
	
}
public static int count(int []rows,int []cols)
{     int[]num=new int[rows.length];
	for (int i = 0; i < cols.length; i++) {
		num[i]=rows[i]+cols[i]-2;
		
	}
	Arrays.sort(num);
	return num[0];
}
}
