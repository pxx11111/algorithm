package cn.edu.jp.abstractclass.data;

public class Book extends Item {

	private String isbn;
	
	public Book(String title, float listPrice) {
		super(title, listPrice);
		// TODO Auto-generated constructor stub
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return title;
	}

}
