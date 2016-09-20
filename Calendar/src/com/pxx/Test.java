package com.pxx;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test {
public static void main(String[] args) {
	Calendar calendar = Calendar.getInstance();
	calendar.set(2016, 5, 1);
	int week=calendar.get(Calendar.DAY_OF_WEEK);
	System.out.println(week); 
}
}
