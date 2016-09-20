package com.pxx;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			long A = scan.nextLong();
			long B = scan.nextLong();
			int count = 0;
			long begin = (long) Math.ceil(A / 0.95);
			long end = (long) Math.floor(A / 0.9) > B 
					? B : (long) Math.floor(A / 0.9);
			while (begin % 5 != 0) {
				begin++;
			}
			for (long i = begin; i <= end; i = i + 5) {
				count++;
			}
			System.out.println(count);
		}
	}
}
