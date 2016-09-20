package com.pxx;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	while(sca.hasNext())
	{   int m=sca.nextInt();
	for(int j=0;j<m;j++){
		int n=sca.nextInt();
		
		if(n%2==0){
			String st=String.valueOf(n);
			Byte b=Byte.parseByte(st);
		String str=b.toString();
		char[] cha=str.toCharArray();
		char[] cha1=new char[cha.length];
		for(int i=cha.length-1;i>=0;i--)
		{
			cha1[i]=cha[i];
			System.out.println(cha[i]);
		}
		System.out.print(cha1.toString()+" ");
		}}
	}
}
}
