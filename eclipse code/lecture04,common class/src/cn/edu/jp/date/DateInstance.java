package cn.edu.jp.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateInstance {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		
		Calendar calender = Calendar.getInstance();
		Calendar gCalender = new GregorianCalendar();
		
		DateFormat format0 = DateFormat.getInstance();
		DateFormat format1 = new SimpleDateFormat();
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
		
		Date myDate = format2.parse("2013-11-11");
		SimpleDateFormat format3 = new SimpleDateFormat("E");
		String dateString = format3.format(myDate);
		System.out.println(dateString);
		
		Date date3 = new Date(300000);
		Calendar calendar3 = Calendar.getInstance();//Date-->Calendar
		calendar3.setTime(date3);
		System.out.println("year:" + calendar3.get(Calendar.YEAR));
		date = Calendar.getInstance().getTime();//Calendar-->Date
		System.out.println(date);
		
	}
}
