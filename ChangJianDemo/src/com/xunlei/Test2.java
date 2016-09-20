package com.xunlei;

import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	while(sca.hasNext()){
		String str=sca.nextLine();
		str=str.substring(4,str.length()-1);
		String[]str1=str.split(",");
		System.out.println(Integer.valueOf(str1[0])+Integer.valueOf(str1[1]));
	}
}
}
