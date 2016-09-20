package com.pxx;

public class Test {
	public static void main(String[] args) {
		int[][]num=new int[][]{{1,2,3},{4,5,6}};
		System.out.println(num[1][1]);
		int n=3;
		System.out.println(Find(num,n));
	}
	    public static boolean Find(int [][] array,int target) {
	        int row=0;
	        int col=array[0].length-1;
	        while(row<=array.length-1&&col>=0){
	            if(target==array[row][col])
	                return true;
	            else if(target>array[row][col])
	                row++;
	            else
	                col--;
	        }
	        return false;
	 
	    }
	}

