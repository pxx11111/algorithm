package cn.edu.jp.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试Date类的用法
 * @author 
 *
 */
public class TestDate {
	public static void main(String[] args) throws ParseException {
		/*Date d = new Date();
		long t = System.currentTimeMillis();
		System.out.println(t);
		Date d2 = new Date(1000);
		
		System.out.println(d2.toGMTString());   //不建议使用
		d2.setTime(24324324);
		System.out.println(d2.getTime());
		System.out.println(d.getTime()<d2.getTime());*/
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");	
		Date date = new Date();
		System.out.println(date);
		date.setTime(1011);
		String resultDate = formatter.format(date);
		System.out.println(resultDate);
		//一年前日期
		date = new Date();
		long myTime = date.getTime()/1000 - 60*60*24*365;
		date.setTime(myTime*1000);
		resultDate = formatter.format(date);
		System.out.println("去年今日日期：" + resultDate);
		//明天日期
		date = new Date();
		myTime = date.getTime()/1000 - 60*60*24;
		date.setTime(myTime*1000);
		resultDate = formatter.format(date);
		System.out.println("明天日期：" + resultDate);
		//计算两个时间之间的天数
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
		date =myFormatter.parse("2003-05-05");
		Date myDate = myFormatter.parse("1899-05-09");
		long days = (date.getTime()-myDate.getTime())/(24*60*60*1000);
		System.out.println("计算两个时间之间的天数:" + days);
		//已知年月日星期，求日期
		SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM F E");
		Date date1 = formatter2.parse("2013-05 3 星期六");
		SimpleDateFormat formatter3 = new SimpleDateFormat("yyyy-MM-dd");
		String result = formatter3.format(date1);
		System.out.println("结果：" + result);
	}
}
