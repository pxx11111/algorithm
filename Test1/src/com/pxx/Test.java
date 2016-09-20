package com.pxx;

public class Test {
public static void main(String[] args) {
	int a[]={1,5,8,13};
	int b[]={2,5,6,18};
	int c[]=new int [a.length+b.length];
	MemeryArray(a, a.length, b, b.length, c);
	for (int i : c) {
		System.out.print(i+" ");
}}
public static void MemeryArray(int a[], int n, int b[], int m, int c[])
{
	int i, j, k;

	i = j = k = 0;
	while (i < n && j < m)
	{
		if (a[i] < b[j])
			c[k++] = a[i++];
		else
			c[k++] = b[j++]; 
	}

	while (i < n)
		c[k++] = a[i++];

	while (j < m)
		c[k++] = b[j++];
}
}
