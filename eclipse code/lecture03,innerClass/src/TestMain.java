
 abstract class Test {
   public static int t=10;
	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		System.out.println(t);
	}*/
	public static int getT() {
		return t;
	}
	public static void setT(int t) {
		t = t;
	}	
}

 public class TestMain{
		public static void main(String[] args) {
			System.out.println("TestMain" +" "+ Test.t);
		}
 }