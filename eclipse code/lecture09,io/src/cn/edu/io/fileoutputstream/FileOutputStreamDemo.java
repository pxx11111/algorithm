package cn.edu.io.fileoutputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		String src = "大家好，欢迎使用Java。";
		byte[] buf = src.getBytes();
		File file = new File("hello.txt");
		OutputStream out = new FileOutputStream(file);
		out.write(buf);
		out.close();
		FileInputStream in = new FileInputStream(file);
		int n = 0;
		while((n= in.read(buf, 0, 2))!=-1){
			String str = new String(buf,0,n);
			System.out.print(str);
		}
		in.close();
	}
}
