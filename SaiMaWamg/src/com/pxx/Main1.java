package com.pxx;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Main1 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		Date date = df.parse(sc.nextLine());
		Date now =df.parse("2015-10-18");
		long l=date.getTime()-now.getTime();
		long day=l/(24*60*60*1000);
		System.out.println(day);
	}
}