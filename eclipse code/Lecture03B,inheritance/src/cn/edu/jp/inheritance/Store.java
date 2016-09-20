package cn.edu.jp.inheritance;

import javax.swing.JOptionPane;

import cn.edu.jp.inheritance.data.Book;
import cn.edu.jp.inheritance.data.Item;
import cn.edu.jp.inheritance.data.MusicCD;

public class Store {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("Java How to Program,Third Edition",78,"978-7-121-15657-1");
	    book1.sell();
	    
		Book book2 = new Book("Java How to Program,Fourth Edition",98,"978-7-121-15659-1");
	    book2.sell(120);
	    
	    MusicCD cd1 = new MusicCD("Play","Moby",24);
	    Item cd2 = new MusicCD("See you,See me","Marry",20);
	    Object cd3 = new MusicCD("Beyond these shores","Iona",300);
	    
	    cd1.sell(20);
	    cd2.sell(30);
	    
	    JOptionPane.showMessageDialog(null,"Sales:\n\n" + book1 +
	    		"\n" + book2 + "\n" + cd1 + "\n" + cd2 + "\n\n" 
	    		+ "There are " +Item.getCount() + " items.");

	    
	    
	}

}
