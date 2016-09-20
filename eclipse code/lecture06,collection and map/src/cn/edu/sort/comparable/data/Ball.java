package cn.edu.sort.comparable.data;

public class Ball implements Comparable {

	/**
	 * @param args
	 */
	private int r;
	private String color;
	private int weight;
	
	
	
	public Ball(int r, String color, int weight) {
		super();
		this.r = r;
		this.color = color;
		this.weight = weight;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	

	@Override
	/*public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + r;
		result = prime * result + weight;
		return result;
	}*/
	public int hashCode(){
		return r+color.hashCode();
	}

	@Override
	/*public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ball other = (Ball) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (r != other.r)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}*/
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if(obj instanceof Ball){
			Ball ball=(Ball)obj;
			return ball.r==this.r && color.equals(ball.color);
		}
		return false;
	}

	@Override
	public String toString() {
		return "(r:" + r + ", color:" + color + ", weight:" + weight + "@" + hashCode() + ")";
	}

	@Override
	public int compareTo(Object o) {
		if(o == null)return 1;
		if(o instanceof Ball){
			Ball ball = (Ball)o;
			return this.r==ball.r?0:(this.r>ball.r?1:-1);
		}
		throw new ClassCastException("比较对象不是" + this.getClass().getName() + "类型");
	}

}
