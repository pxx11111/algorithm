package cn.edu.jp.toString.data;


public class Book {
	static private long count;

	private String title = "(no title)";
	private float listPrice;

	public Book(String title, float listPrice) {
		super();
		this.title = title;
		this.listPrice = listPrice;
		count++;
	}

	public static long getCount() {
		return count;
	}

	public static void setCount(long count) {
		Book.count = count;
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

	@Override
	public String toString() {
		return title + ":" +listPrice + "RMB";
	}
	
	
}
