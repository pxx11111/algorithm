package com.pxx;

import java.util.Scanner;

public class Test5 {


	

		public static int minPath(int[][] m) {
			int min=0;
			for (int i = 0; i < m.length; i++) {
				
				int cur=0;
				for (int j = 0; j < m.length; j++) {
					cur+=m[i][j];
				}
				min=Math.min(min, min);
			}
			return min;
		}

		
		

		public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		String n1=sca.nextLine();
		int n=Integer.valueOf(n1);
			int[][] m =new int[n][n];
			for (int i = 0; i < m.length; i++) {
				String str=sca.nextLine();
				String []arr=str.split(",");
				for (int j = 0; j < arr.length; j++) {
					m[i][j]=Integer.valueOf(arr[j]);
					
				}
				
			}
			System.out.println(minPath(m));
			

		}
	
}
