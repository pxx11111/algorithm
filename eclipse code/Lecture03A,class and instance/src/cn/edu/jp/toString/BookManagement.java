package cn.edu.jp.toString;

import javax.swing.JOptionPane;

import cn.edu.jp.toString.data.Book;



public class BookManagement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Book book1 = new Book("Java How to Program,Third Edition",78);
		  
		  Book book2 = new Book("Java How to Program,Fouth Edition",99);
		  
		  JOptionPane.showMessageDialog(null, "Book list:\n\n" + book1 + "\n" +
		                                  book2 + "\n\n" + "There are " + new Long(Book.getCount()).toString() + " books.");
	}

}
