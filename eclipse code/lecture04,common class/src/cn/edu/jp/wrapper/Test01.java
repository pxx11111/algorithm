package cn.edu.jp.wrapper;

/**
 * 测试包装类的基本用法
 * @author 
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Integer  i = new Integer(1000);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(i));
		Integer i2 = Integer.parseInt("234");
		int o = Integer.parseInt("12",8);
		System.out.println("o:" + o);
		
		Integer i3 = new Integer("333");
		System.out.println(i2.intValue());
		String str = 234+"";
		
		
	}
}
