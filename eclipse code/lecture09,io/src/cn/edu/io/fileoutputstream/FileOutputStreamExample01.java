package cn.edu.io.fileoutputstream;

import java.io.*;

public class FileOutputStreamExample01 {
	public static void main(String args[]) {
		try {
			System.out.print("输入一行字符: ");
			int count, n = 512;
			byte buffer[] = new byte[n];
			FileOutputStream wf = new FileOutputStream("Output.txt");
			count = System.in.read(buffer);
			wf.write(buffer, 0, count); // 写入输出流
			wf.close(); // 关闭输出流
			System.out.println("输入行字符已保存到Output.txt!");
		} catch (IOException ioe) {
			System.out.println(ioe);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
