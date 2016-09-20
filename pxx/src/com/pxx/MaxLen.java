package com.pxx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MaxLen {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		System.out.print("请输入数组的长度：");
		  BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
		  int m=Integer.parseInt(in.readLine());
		  int[] a=new int[m];
		  System.out.println("请输入要存入的整数：");
		  BufferedReader im=new BufferedReader(new InputStreamReader(System.in));
		  String[] s=im.readLine().split(" ");
		  for (int i=0;i< m ;i++ )
		  {
		   a[i]=Integer.parseInt(s[i]);
		   
		  }
		  System.out.println("你输入的数组为：");
		  for (int i=0;i<m ;i++ )
		  {
		   System.out.print(a[i]+" ");
		  }

	}}
