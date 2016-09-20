package cn.edu.jp.simpledateformat.data;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public abstract class Item implements Comparable, Name {
	public static final String CURRENCY = "RMB";

	protected static long count;
	protected String title = "(no title)";
	protected float listPrice;
	protected float sales;
	protected String dateOfSell;

	public Item(String title, float listPrice) {
		super();
		this.title = title;
		this.listPrice = listPrice;

		++count;
	}

	public static long getCount() {
		return count;
	}

	public static void setCount(long count) {
		Item.count = count;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getListPrice() {
		return listPrice;
	}

	public void setListPrice(float listPrice) {
		this.listPrice = listPrice;
	}

	public float getSales() {
		/*String pattern = "###,###.###￥" ;
		return Double.parseDouble(format1(pattern,sales));
		*/
		return sales;
	}

	public void setSales(float sales) {
		this.sales = sales;
	}
	
	public String getFormatSales(){// 此方法专门用于完成数字的格式化显示
		String pattern = "###,###.###￥" ;
		DecimalFormat df = null ;	        // 声明一个DecimalFormat类的对象
		df = new DecimalFormat(pattern) ;	// 实例化对象，传入模板
		String str = df.format(sales) ;
		return str;
	}
	
	
	
	public String getDateOfSell() {
		return dateOfSell;
	}

	public void setDateOfSell(String dateOfSell) {
		this.dateOfSell = dateOfSell;
	}

	public void sell() throws ParseException {
		sales += listPrice;
		//dateOfSell = getDateOfSell();
		setDateOfSell(getDate()) ;
	}

	@SuppressWarnings("deprecation")
	public void sell(int numberOfItems) throws ParseException {
       	sales += listPrice * numberOfItems;
       	//dateOfSell = getDateOfSell();
       	setDateOfSell(getDate()) ;
	}

	private String addZero(int num,int len){
		StringBuffer s = new StringBuffer() ;
		s.append(num) ;
		while(s.length()<len){	  // 如果长度不足，则继续补0
			s.insert(0,"0") ;	// 在第一个位置处补0
		}
		return s.toString() ;
}

	
	public String getDate(){	// 得到的是一个日期：格式为：yyyy-MM-dd HH:mm:ss.SSS
		// 考虑到程序要频繁修改字符串，所以使用StringBuffer提升性能
		Calendar calendar = new GregorianCalendar() ;
		
		StringBuffer buf = new StringBuffer();
		buf.append(calendar.get(Calendar.YEAR)).append("-") ;// 增加年
		buf.append(this.addZero(calendar.get(Calendar.MONTH)+1,2)).append("-") ;	// 增加月
		buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH),2)).append(" ") ;// 取得日
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY),2)).append(":") ;// 取得时
		buf.append(this.addZero(calendar.get(Calendar.MINUTE),2)).append(":") ;
		buf.append(this.addZero(calendar.get(Calendar.SECOND),2)).append(".") ;
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND),3)) ;
		return buf.toString();
	}


	/*public String getDateComplete() {
		// 得到的是一个日期：格式为：yyyy年MM月dd日 HH时mm分ss秒SSS毫秒
		// 考虑到程序要频繁修改字符串，所以使用StringBuffer提升性能
		
		Calendar calendar = new GregorianCalendar() ;
		StringBuffer buf = new StringBuffer();
		buf.append(calendar.get(Calendar.YEAR)).append("年"); // 增加年
		buf.append(this.addZero(calendar.get(Calendar.MONTH) + 1, 2)).append(
				"月");// 增加月
		buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH), 2))
				.append("日");// 取得日
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY), 2)).append(
				"时");// 取得时
		buf.append(this.addZero(calendar.get(Calendar.MINUTE), 2)).append("分");// 取得分
		buf.append(this.addZero(calendar.get(Calendar.SECOND), 2)).append("秒");// 取得秒
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND), 3)).append(
				"毫秒");// 取得毫秒
		return buf.toString();
	}*/

	/*public String getDateOfSell() {
		String srcDate = getDate();
		//String srcDate = "2013-4-21 20:26:02.356";
		String pat1 = "yyyy-MM-dd HH:mm:ss.SSS" ;	
		String pat2 = "yyyy年MM月dd日 HH时mm分ss秒SSS毫秒" ;
		
		SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);	// 实例化模板对象
	    SimpleDateFormat sdf2 = new SimpleDateFormat(pat2);	// 实例化模板对象
		Date d = null;
		
	    try {
			d = sdf1.parse(srcDate) ;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	    
		return sdf2.format(d);
	}*/

	@Override
	public String toString() {
		return getName() + ":" + listPrice + " " + CURRENCY
				+ ",date and time of sale:" + /*this.getDateOfSell()*/ this.getDateOfSell() + ",sales:"
				+ getFormatSales() + " " + CURRENCY;
	}

	@Override
	public int compareTo(Object object) {
		Item item = (Item) object;
		int flag;
		if (getName().compareTo(item.getName()) < 0)
			flag = -1;
		else if (getName().compareTo(item.getName()) > 0)
			flag = 1;
		else
			flag = 0;
		return flag;
	}

}
