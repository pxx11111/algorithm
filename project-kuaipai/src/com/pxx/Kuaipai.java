package com.pxx;

public class Kuaipai {
public static void main(String[] args) {
	int []a={2,7,8,56,10};
	
	part(a,0,a.length-1);
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}
public static void part(int a[],int low,int high)
{
	
	if(low>high)
	{
		return;
	}
	int i=low,j=high;
	int key=a[low];
	while(i<j)
	{
		while(i<j&&key<a[j])
		{
			j--;
		}
		a[i]=a[j];
		while(i<j&&key>a[i])
		{
			i++;
		}
		a[j]=a[i];
		a[i]=key;
		part(a,low,i-1);
		part(a,i+1,high);
	}
}

}
