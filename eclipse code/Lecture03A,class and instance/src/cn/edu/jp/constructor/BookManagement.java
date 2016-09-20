package cn.edu.jp.constructor;

import javax.swing.JOptionPane;

import cn.edu.jp.constructor.data.Book;

public class BookManagement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  Book book1 = new Book("Java How to Program,Third Edition",78);
		  
		  Book book2 = new Book("Java How to Program,Fouth Edition",99);
		  
		  JOptionPane.showMessageDialog(null, "Book list:\n\n" + book1.getTitle() + "\n" +
		                                  book2.getTitle() + "\n");
		}

}
