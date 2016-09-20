package com.pxx;

import java.util.Scanner;

public class TestTEst
  {
	  public static void main(String[] args) {
	   Scanner sca=new Scanner(System.in);
	   while(sca.hasNext())
	   { int n=sca.nextInt();
	   if(n<=1)
	   {  n=n+1;
		   System.out.println(n+" "+"1");}
	 System.out.println(n+" "+"2");
	}}
  }