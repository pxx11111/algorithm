package cn.edu.jp.date;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat1 {

	public static void main(String[] args) throws ParseException {
		String dateString = "2014-05-15 10:28:36";
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = format.parse(dateString);
		
		DateFormat otherFormat = 
				DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		System.out.println(otherFormat.format(date));
		
		otherFormat = 
				DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
		System.out.println(otherFormat.format(date));
		
		otherFormat = 
				DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		System.out.println(otherFormat.format(date));
		otherFormat = 
				DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		System.out.println(otherFormat.format(date));
		
	}

}
