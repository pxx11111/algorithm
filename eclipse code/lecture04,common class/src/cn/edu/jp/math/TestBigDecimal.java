package cn.edu.jp.math;

import java.math.BigDecimal;

public class TestBigDecimal {

	public static void main(String[] args) {
		/*BigDecimal bd1 = new BigDecimal(0.1);
		BigDecimal bd2 = new BigDecimal(0.1);
		
		bd1 = bd1.multiply(bd2);
		System.out.println(bd1);
		
		BigDecimal bd3 = new BigDecimal("0.1");
		BigDecimal bd4 = new BigDecimal("0.1");
		
		bd3 = bd3.multiply(bd4);
		System.out.println(bd3);*/
		String s = "123.48";
		BigDecimal bi = new BigDecimal(s);
		bi = bi.setScale(1, BigDecimal.ROUND_DOWN);
		System.out.println(bi);
		
		s = "123.48";
		bi = new BigDecimal(s);
		bi = bi.setScale(1, BigDecimal.ROUND_HALF_UP);
		System.out.println(bi);
		
		s = "123.48";
		BigDecimal bi1 = new BigDecimal(s);
		BigDecimal bi2 = new BigDecimal(s);
		System.out.println("小数点左移：" + bi1.movePointLeft(1));
		System.out.println("小数点右移：" + bi2.movePointRight(1));
		
	}

}
