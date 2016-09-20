package cn.edu.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("d:" + File.separator + "a.txt");
			char ch1 = (char) reader.read();
			char ch2 = (char) reader.read();
			System.out.println("" + ch1 +ch2);
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
