package com.t2016818;

public class Ö±·½Í¼copy {
	public static void main(String[] args) {
		int []A={2,7,9,4};
		System.out.println(count(A,0, A.length-1));
	}
	public static int count(int []a,int start,int end)
	{
		if(start>end)
			return 0;
		if(start==end)
			return a[start];
		int highlength=findmin(a,start,end);
			int max=(end-start+1)*a[highlength];
			max=Math.max(max, count(a, start, highlength-1));
			max=Math.max(max, count(a, highlength+1,end));
			return max;
	}
	public static int findmin(int []a,int left,int right)
	{
		int min=left;
		for (int i = left+1; i <=right; i++) {
			if(a[i]<a[min])
				min=i;
		}
		return min;
	}
}
