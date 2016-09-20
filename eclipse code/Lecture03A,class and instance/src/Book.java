import javax.swing.JOptionPane;

public class Book {
  public String title = "(no title)";
  public float listPrice;
  
  public Book(){
	  
  }
  
  public static void main(String[] args){
		Book book1 = new Book();
		book1.title = "Java How to Program,Third Edition";
		book1.listPrice = 78;

		Book book2 = new Book();
		book2.title = "Java How to Program,Fouth Edition";
		book2.listPrice = 78;
		
		JOptionPane.showMessageDialog(null, "Book list:\n\n" + book1.title
				+ "\n" + book2.title + "\n");
  }
}
