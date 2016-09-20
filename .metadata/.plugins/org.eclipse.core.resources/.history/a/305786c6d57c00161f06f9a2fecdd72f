package com.pxx;

import java.util.Scanner;

public class Test4 {
public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	while(sca.hasNext())
	{
		int k=sca.nextInt();
		int n=sca.nextInt();
		int []arr=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sca.nextInt();
		}
		int b=0;
		int e=arr.length-1;
	 sort(arr,b,e,k);
	}
}
public static void sort(int[] arr,int b,int e,int k)
{
	while(b<e){
	int mid=(b+e)/2;
    if(arr[mid]==k)
    	{System.out.println( mid);
    	break;}else
    if(k>arr[mid])
    {
    	sort(arr,mid+1,e,k);
    }else{
    	sort(arr,b,mid-1,k);
    }
    System.out.println(-1-(mid+1));
    break;}
	


}
}
