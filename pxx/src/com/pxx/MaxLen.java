package com.pxx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MaxLen {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		System.out.print("����������ĳ��ȣ�");
		  BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
		  int m=Integer.parseInt(in.readLine());
		  int[] a=new int[m];
		  System.out.println("������Ҫ�����������");
		  BufferedReader im=new BufferedReader(new InputStreamReader(System.in));
		  String[] s=im.readLine().split(" ");
		  for (int i=0;i< m ;i++ )
		  {
		   a[i]=Integer.parseInt(s[i]);
		   
		  }
		  System.out.println("�����������Ϊ��");
		  for (int i=0;i<m ;i++ )
		  {
		   System.out.print(a[i]+" ");
		  }

	}}
