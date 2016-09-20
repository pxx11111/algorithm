package cn.edu.math.jp;
import java.text.* ;
class FormatDemo{
	public void format1(String pattern,double value){// 此方法专门用于完成数字的格式化显示
		DecimalFormat df = null ;	        // 声明一个DecimalFormat类的对象
		df = new DecimalFormat(pattern) ;	// 实例化对象，传入模板
		String str = df.format(value) ;	// 格式化数字
		System.out.println("使用" + pattern  + "格式化数字" + value + "：" + str) ;
	}
}

public class NumberFormatDemo02{
	public static void main(String args[]) throws ParseException{
		FormatDemo demo = new FormatDemo() ;	// 格式化对象的类
		/*demo.format1("###,###.###",111222.34567) ;
		demo.format1("000,000.000",11222.34567) ;
		demo.format1("###,###.###￥",111222.34567) ;
		demo.format1("000,000.000￥",11222.34567) ;
		demo.format1("##.###%",0.345678) ;
		demo.format1("00.###%",0.0345678) ;
		demo.format1("###.###\u2030",0.345678) ;
		demo.format1("000,000.000E0",11222.34567) ;
		demo.format1("0.000E0",11222.34567) ;*/
		
		DecimalFormat df = new DecimalFormat() ;
		
		String str = "111222.34567";
		df.applyPattern("###,###.###");
		Number num = df.parse(str);
		System.out.println(num.doubleValue());
		
		str = "11222.34567";
		df.applyPattern("000,000.000") ;
		num = df.parse(str);
		System.out.println(num.doubleValue());
		
		str = "11222.34567￥";
		df.applyPattern("###,###.###") ;
		num = df.parse(str);
		System.out.println(num.doubleValue());
		
		str = "0.0345678%";
		df.applyPattern("##.###");
		num = df.parse(str);
		System.out.println(num.doubleValue());
				
	}
}
