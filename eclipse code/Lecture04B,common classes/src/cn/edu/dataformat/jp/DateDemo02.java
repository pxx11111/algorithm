package cn.edu.dataformat.jp;

import java.util.*;

public class DateDemo02 {
	public static void main(String args[]) {
		Calendar calendar = new GregorianCalendar(); // ʵ����Calendar�����
		System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		System.out.println("MONTH: " + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("DAY_OF_MONTH: "
				+ calendar.get(Calendar.DAY_OF_MONTH));
		System.out
				.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
		System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
		System.out
				.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
		System.out.println("total:" + calendar);
	}
}
