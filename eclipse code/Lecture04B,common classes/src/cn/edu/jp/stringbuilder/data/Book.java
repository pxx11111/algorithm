package cn.edu.jp.stringbuilder.data;

public class Book extends Item {

	private String isbn;
	
	public Book(String title, float listPrice,String isbn) {
		super(title, listPrice);
		this.isbn = isbn;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return title;
	}

}
