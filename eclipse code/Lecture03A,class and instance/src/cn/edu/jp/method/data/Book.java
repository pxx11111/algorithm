package cn.edu.jp.method.data;

public class Book {
	static private long count;

	private String title = "(no title)";
	private float listPrice;
	private float sales;



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

	public float getSales() {
		return sales;
	}

	public void setSales(float sales) {
		this.sales = sales;
	}
	
	public void sell(){
		sales+=listPrice;
	}
	
	public void sell(int numberOfBooks){
		sales+=listPrice*numberOfBooks;
	}
	
	@Override
	public String toString() {
		return title + ":" +listPrice + "RMB,sales:" + sales + "RMB.";
	}
}
