package com.pxx;

import java.util.*;

public class ZiFuChuanPaiWei{
	public static void main(String[] args) {
		long[] arr = new long[12];
		ZiFuChuanPaiWei obj = new ZiFuChuanPaiWei();
		arr[0] = 1;
		for(int i = 1; i < 12; i++) {
			long sum = 1;
			int temp = i;
			while(temp > 0) {
				sum *= temp;
				temp--;
			}
			arr[i] = sum;
		//	System.out.println(sum);
		}
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			System.out.println(obj.getPos(s, arr));
		}
		
		
		
	}
	int usedBefore(char ch, int[] used){
		int ret = 0;
		for (int i = 0; i < (ch - 'a'); i++)ret += used[i];
		return ret;
	}
	
	public long getPos(String s, long[] arr) {
		int[] used = new int[12];
		long pos = 1;
		for(int i = 0; i < 12; i++) {
			int diff = s.charAt(i) - 'a' - usedBefore(s.charAt(i), used);
			pos += arr[11 - i] * diff;
			used[s.charAt(i) - 'a'] = 1;
		}
		return pos;
	}
}
