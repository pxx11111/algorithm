package com.xiecheng;

import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int x = in.nextInt();
			int n = in.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i]=in.nextInt();
			}

			int res = -1;
			int low = 0;
			int high = arr.length - 1;
			while (low <= high) {
				int mid = (low + high) / 2;
				if (x == arr[mid]) {
					res =mid;
					break;
				} else if (x < arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
			if(res ==-1){
				res = res-low;
			}
			System.out.println(res);
		}
		
	}
} //ÊäÈë 5 1 3 6 Êä³ö -3
