package cn.edu.jp;

public class TestReal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * float范围：[-3.4E10^38,3.4E10^38]虽然都是4个字节，int可以准确表示数据，float虽然范围大，但不准确
		 * 
		 */
		double d = 6.28;  //数字常量默认double类型
		//float f = 6.29; //报错，数字后加F（大小写均可，推荐用大写）即可
		float f1 = 6.29F;
		/**
		 * 科学计数法
		 */
		float f2 = 314e-2F;
		
		/**
		 * 推荐不要使用浮点数比较,如需要，则使用BigDecimal
		 */
		
		float f3 = 0.1F;
		double d3 = 1.0/10;
		System.out.println(f3==d3); //false
		
		
	}

}
