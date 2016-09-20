package com.pxx1;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	int m=sca.nextInt();
	if(m>10000)
		return;
	
	int count=0;
	int a[]=new int[m];
	for (int i = 0; i < m; i++) 
	{   
		int n=sca.nextInt();
		if(n>=100000)
			return;
		for (int j = 1; j <= n; j++) {
			if(f(j)==g(j))
			{
				count++;
			}
		}
		a[i]=count;
		count=0;
		
	}
	for (int i :a) {
		System.out.println(i);
	}
}
public static int f(int n)
{
	int sum=0;
	while(n!=0)
	{
		sum+=n%10;
		n=n/10;
	}
	return sum;
	}
public static int g(int n)
{

	int sum=0;
	while(n!=0)
	{
		sum+=n%2;
		n=n/2;
	}
	return sum;
}}

