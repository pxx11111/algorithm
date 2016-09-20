package cn.edu.regex.jp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSpider {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args)  {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("d:\\share\\xxx.html"));
			String line = "";
			while((line = reader.readLine())!=null){
				parse(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void parse(String line) {
		String regex = "[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(line);
		while(m.find()){
			System.out.println(m.group());
		}
		
	}

}
