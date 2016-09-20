package cn.edu.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReadFile {
	public static void main(String[]  args) /*throws FileNotFoundException, IOException*/ {
		String str = null;
		try {
			str = new TestReadFile().openFile();
		} catch (FileNotFoundException e) {
			System.out.println("helo");
			e.printStackTrace();
		}
		System.out.println(str);
	} 
	/**
	 * 1.执行try-catch,给返回值赋值
	 * 2.执行finally
	 * 3.return
	 * @throws FileNotFoundException 
	 * 
	 */
	
	public String openFile() throws FileNotFoundException  { 
		try {
			System.out.println("start try");
			FileReader reader = new FileReader("d:/aa.txt");
			char c = (char)reader.read();
			System.out.println(c);
			return "try";
			
		} catch (FileNotFoundException e) {
			System.out.println("catch01");
			e.printStackTrace();
			//return "catch01";
			throw e;
			
		} catch (IOException e) {
			System.out.println("catch02");
			e.printStackTrace();
			return "catch02";
		} finally{
			System.out.println("finally");
			return "finally";
		}
	}
}

