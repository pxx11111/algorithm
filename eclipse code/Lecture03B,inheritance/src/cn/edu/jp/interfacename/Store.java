package cn.edu.jp.interfacename;

import java.util.Arrays;

import javax.swing.JOptionPane;

import cn.edu.jp.comparable.data.Book;
import cn.edu.jp.comparable.data.Item;
import cn.edu.jp.comparable.data.MusicCD;



public class Store {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Book book1 = new Book("Java How to Program,Third Edition",78,"978-7-121-15657-1");
	    book1.sell();
	    
		Book book2 = new Book("Java How to Program,Fourth Edition",98,"978-7-121-15659-1");
	    book2.sell(120);
	    
	    MusicCD cd1 = new MusicCD("Play","Moby",24);
	    MusicCD cd2 = new MusicCD("See you,See me","Marry",20);
	    MusicCD cd3 = new MusicCD("Beyond these shores","Iona",300);
	    
	    cd1.sell(20);
	    cd2.sell(30);
	    
	    Item[] items = {book1,book2,cd1,cd2,cd3};
	    Arrays.sort(items);
	    
	    String text = "";
	    
	    for(int index=0;index<items.length;++index){
	    	text+=items[index].toString()+"\n";
	    }
	    
	    JOptionPane.showMessageDialog(null,"Sales:\n\n" + text + "\n" 
	    		+ "There are " +Item.getCount() + " items.");

	}

}
