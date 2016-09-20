package com.p20160903;

public class Test {
	public static void main(String[] args) {
		int A[]={1,2,8,9,6,4};
	
	for (int i = 1; i < A.length; i++) {
        int k=i-1;
        int tem=A[i];
        while(k>=0&&A[k]>tem){
            A[k+1]=A[k];
            k--;
        }}
	for (int i : A) {
		System.out.print(i+" ");
	}
	}
	
}
