package cn.edu.jp.inheritance.data;

public class Book extends Item {
	
    private String isbn;

	public Book(String title,float listPrice,String isbn){
		super(title,listPrice);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
   
	
    
}
