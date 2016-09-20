package cn.edu.jp.constructor.data;

public class Book {
	private String title = "(no title)";
	private float listPrice;

	public Book() {

	}

	public Book(String title, float listPrice) {
		this.title = title;
		this.listPrice = listPrice;
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
}
