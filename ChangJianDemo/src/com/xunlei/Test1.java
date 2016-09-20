package com.xunlei;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	while(sca.hasNext()){
    String str=sca.nextLine();
   String[] str1=str.substring(1, str.length()-1).split(",");
//	public static void main(String[] args) {
//		int[]str={7,51,52,3};
//		Test(str);
//	}
//public static void Test(int []str){
   int[]str2=new int[str1.length];
   for (int i = 0; i < str1.length; i++) {
	   str2[i]=Integer.valueOf(str1[i]);
}
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1.length; j++) {
				if(str2[i]<str2[j])
					swap1(str2, i, j);
			}
		}
		
		//String [] str1=new String[str.length];
		//for (int i = 0; i < str1.length; i++) {
		//	str1[i]=String.valueOf(str[i]);
		//}
		
    int num=0;
    for (int i = 0; i < str1.length; i++) {
		num=Math.max(num, str1[i].length());
	}
   
	for (int i = 0; i < str1.length; i++) {
		for (int j = i; j < str1.length; j++) {
		if(Integer.valueOf(str1[i].charAt(0)-48)!=Integer.valueOf(str1[j].charAt(0)-48)){
			if(Integer.valueOf(str1[i].charAt(0)-48)<Integer.valueOf(str1[j].charAt(0)-48))
			{swap(str1,i,j);}
		}else{if(str1[i].length()==str1[j].length())
		{if(Integer.valueOf(str1[i])<Integer.valueOf(str1[j]))
			swap(str1,i,j);}
		}
		
		}
		
	}
	for (int i = 0; i < str1.length; i++) {
		System.out.print(str1[i]);
	}}
	}
	

public  static void swap(String[] str,int i,int j)
{
	String temp=str[i];
	str[i]=str[j];
	str[j]=temp;
}
public  static void swap1(int[] str,int i,int j)
{
	int temp=str[i];
	str[i]=str[j];
	str[j]=temp;
}
}
