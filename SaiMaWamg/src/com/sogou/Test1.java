package com.sogou;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	String str=sca.nextLine();
	char[]ch=str.toCharArray();
	int sum[]=new int [ch.length];
	for (int i = 0; i < ch.length; i++) {
		int count=0;
		for (int j = ch.length-1; j >0; j--) {
			if(ch[i]==ch[j])
				count++;
		}
		sum[i]=count;
	}
	Arrays.sort(sum);
	System.out.println(sum[ch.length-1]);
			}
}
