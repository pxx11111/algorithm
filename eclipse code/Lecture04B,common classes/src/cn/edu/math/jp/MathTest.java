package cn.edu.math.jp;

import java.text.NumberFormat;
import java.util.Random;

public class MathTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*System.out.println("平方根：" + Math.sqrt(9.0));
		System.out.println("两数较大者：" + Math.max(5.0,6.0));
		System.out.println("两数较小者：" + Math.min(6.0, 5.0));
		System.out.println("2的3次方：" + Math.pow(2, 3));
        System.out.println("4舍5入：" + Math.round(33.55));
        System.out.println("4舍5入：" + Math.round(33.44));
        System.out.println(Math.rint(-33.5));
        for(int i=0;i<10;i++)
        	System.out.print((int)(Math.random()*(90-50+1)+50) + "\t");//[50,90]之间随即整数
		System.out.println();*/
		
		/*Random r = new Random();
		for(int i =0;i<10;i++)
			System.out.print((r.nextInt(100)) + "\t");*/
		
		NumberFormat nf = null ;	                // 声明一个NumberFormat对象
		nf = NumberFormat.getInstance() ;	// 得到默认的数字格式化显示
		System.out.println("格式化之后的数字：" + nf.format(10000000)) ;
		System.out.println("格式化之后的数字：" + nf.format(1000.345)) ;
		
		
		
	}

}
