package cn.edu.jp.stringbuilder.data;

public abstract class Item implements Comparable ,Name{
	public static final String CURRENCY = "RMB";

	protected static long count;
	protected String title = "(no title)";
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

	public float getSales() {
		return sales;
	}

	public void setSales(float sales) {
		this.sales = sales;
	}
	
	public void sell(){
		sales+=listPrice;
	}
	
	public void sell(int numberOfItems){
		sales+=listPrice*numberOfItems;
	}	
	
	
	@Override
	public String toString() {
		return getName() +":" + listPrice + " " + CURRENCY +",sales:" +
	                            sales + " " + CURRENCY;
	}

	@Override
	public int compareTo(Object object) {
			Item item = (Item)object;
			int flag;
			if(getName().compareTo(item.getName())<0)
			   flag = -1;
			else if(getName().compareTo(item.getName())>0)
				flag = 1;
			else
				flag = 0;
			return flag;
	}
	
	
}
