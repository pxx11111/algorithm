package com.t20160820;

import java.util.ArrayList;

public class Test2 {
public static void main(String[] args) {
	for (int i = 0; i <10; i++) {
		ArrayList<Integer>arr=getRow(i);
		for (Integer integer : arr) {
			System.out.print(integer+" ");
		}
		System.out.println();
	}
}
	public static ArrayList<Integer> getRow(int rowIndex) {
		ArrayList<Integer> res = new ArrayList<>();
		int[] dp = new int[rowIndex + 1];

		dp[0] = 1;
		for (int i = 0; i < rowIndex; i++) {
			for (int j = i + 1; j >= 1; j--) {
				dp[j] += dp[j - 1];
			}
		}
		for (int i = 0; i < rowIndex + 1; i++)
			res.add(dp[i]);
		return res;
	}

}