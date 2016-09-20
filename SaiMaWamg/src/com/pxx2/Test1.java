package com.pxx2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1{
	public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	ArrayList<Integer>arr=new ArrayList<>();
	while(sca.hasNext())
	{
		int i=sca.nextInt();
		arr.add(i);
	}
		for (Integer i : arr) {
			
		
		if(i!=1)
        {
			System.out.println("no");
			}else
		
		{
		   System.out.println(f(1));
		}
		}	
	
	}
	public static int f(int n)
	{
		if(n==10)
		{	return 1;}else{
			
			return (f(n+1)+1)*2;
		}
		
		}
	    
		
	
}
