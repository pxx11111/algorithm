/**
 * 
 */
package cn.edu.jp.inheritance.data;

/**
 * @author lee hongli
 * 
 */
public class Item {
	public static final String CURRENCY = "RMB";

	protected static long count;
	
	protected String title = "(no name)";
	
	protected float listPrice;

	protected float sales;


	
	public Item(String title, float listPrice) {
		super();
		this.title = title;
		this.listPrice = listPrice;
		
		++count;
	}

	public static long getCount() {
		return count;
	}

	public static void setCount(long count) {
		Item.count = count;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
    
	public void sell(){
		sales+=listPrice;
	}
	
	public void sell(int numberOfItems){
		sales+=numberOfItems*listPrice;
	}

	@Override
	public String toString() {
		return title + ":" + listPrice + " " + CURRENCY + ", sales:"
				+ sales + " " + CURRENCY;
	}
	
	
}
