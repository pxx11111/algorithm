package com.pxx;

import java.util.Arrays;
import java.util.Scanner;
public class Popt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int num=sc.nextInt();
		char[]perm=str.toCharArray();
		
		do{ 
			for (int i = 0; i < num; i++) {
				System.out.print(perm[i]);
			}
			System.out.println();
			
		}while(CalcAll(perm,num));
		}
		
	public  static boolean CalcAll(char[] perm,int num)
	{  
	int i;
		for(i=num-2;(i>=0)&&(perm[i]>=perm[i+1]);--i)
		{;}
		if(i<0)
		{
			return false;
		}
		int k;
	   for (k = num-1; (k>i)&&(perm[k]<=perm[i]); --k)
	   {;}
	   char temp=perm[i];
	   perm[i]=perm[k];
	   perm[k]=temp;
	  for(int j=i+1;j<(perm.length-i-1)/2;j++)
	    {char temp1 = perm[j];
	    perm[j] = perm[num - j];
	    perm[num - j] = temp1;
	   }
	   
	 return true;
	}}


