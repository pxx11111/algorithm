package com.xiecheng;

import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			String s = in.nextLine();
			String[] str = s.split(",");
			int [] price = new int[str.length];
			for(int i = 0 ; i<price.length;i++){
				price[i] = Integer.parseInt(str[i]);
			}
			int max= 0;
			int min=price[0];
			for(int i = 1; i<price.length;i++){
				if(price[i]>min){
					max=price[i]-min>max?price[i]-min:max;
				}else {
					min = price[i];
				}
			}
			System.out.println(max);
		}
	}
} 
