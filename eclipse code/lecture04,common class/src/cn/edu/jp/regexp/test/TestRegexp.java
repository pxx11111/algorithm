package cn.edu.jp.regexp.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class TestRegexp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       String input = JOptionPane.showInputDialog(null, "请输入数据，注意格式！");//2012-10-12 2012-01-09 2012-12-30
       //匹配生日
       String reg = "((19\\d{2})|(200\\d)|(201[0-4]))-(0?[1-9]|1[0-2])-(0?[1-9]|[1-2][0-9]|3[0-1])";
       Pattern p = Pattern.compile(reg);
       Matcher m = p.matcher(input);
       print(m);
		/*String input = JOptionPane.showInputDialog(null, "请输入数据，注意格式！");//2012-01-12 2012-01-09 2012-12-30
        String reg = "1\\d{10}";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(input);
        print(m);*/
	}

	private static void print(Matcher m) {
		while(m.find()){
			   
			   String str = m.group();
			System.out.println("[" + m.start() + "," + m.end() + "]:" + str);
		}
	}

}
