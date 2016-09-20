package com.t2016818;

public class 最大直方图 {
	public static void main(String[] args) {
	int []A={2,7,9,4};
	System.out.println(countArea(A, A.length));
}
	public static int countArea(int[] A, int n) {
	        // write code here
	        return countCore(A,0,n-1);
	    }
	     private static int countCore(int[] A , int left , int right){
	        if(left>right)
	            return 0;
	        if(left==right)
	            return A[left];
	        int highIndex = findMin(A,left,right);
	        int max = (right-left+1)*A[highIndex];
	        max = Math.max(max, countCore(A,left,highIndex-1));
	        max = Math.max(max, countCore(A,highIndex+1,right));
	        return max;
	    }
	     
	    private static int findMin(int[] A , int left , int right){
	        int min = left;
	        for(int i=left+1;i<=right;i++)
	        if(A[i]<A[min])
	                min = i;
	        return min;
	    }
	

}
