package com.pxx;

import java.util.Scanner;

public class ZuiChangJiangXu
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			int m=scanner.nextInt();
			int a[]=new int[m];
			for(int j=0;j<m;j++)
			{
				a[j]=scanner.nextInt();
			}
			System.out.println(helper(a));
		}
		scanner.close();
	}

	//求最长连续递减子序列
	private static int helper(int[] a)
	{
		if(a==null||a.length<=0)
			return 0;
		int temp[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			temp[i]=1;
			for(int j=0;j<i;j++)
			{
				if(a[j]>a[i]&&(temp[j]+1>temp[i]))
				{
					temp[i]=temp[j]+1;
				}
			}
		}
		int maxLen=0;
		for(int i=0;i<a.length;i++)
			maxLen=maxLen>temp[i]?maxLen:temp[i];
		return maxLen;
	}

}
