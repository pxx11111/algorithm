package cn.edu.math.jp;

import java.text.NumberFormat;
import java.util.Random;

public class MathTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*System.out.println("ƽ������" + Math.sqrt(9.0));
		System.out.println("�����ϴ��ߣ�" + Math.max(5.0,6.0));
		System.out.println("������С�ߣ�" + Math.min(6.0, 5.0));
		System.out.println("2��3�η���" + Math.pow(2, 3));
        System.out.println("4��5�룺" + Math.round(33.55));
        System.out.println("4��5�룺" + Math.round(33.44));
        System.out.println(Math.rint(-33.5));
        for(int i=0;i<10;i++)
        	System.out.print((int)(Math.random()*(90-50+1)+50) + "\t");//[50,90]֮���漴����
		System.out.println();*/
		
		/*Random r = new Random();
		for(int i =0;i<10;i++)
			System.out.print((r.nextInt(100)) + "\t");*/
		
		NumberFormat nf = null ;	                // ����һ��NumberFormat����
		nf = NumberFormat.getInstance() ;	// �õ�Ĭ�ϵ����ָ�ʽ����ʾ
		System.out.println("��ʽ��֮������֣�" + nf.format(10000000)) ;
		System.out.println("��ʽ��֮������֣�" + nf.format(1000.345)) ;
		
		
		
	}

}
