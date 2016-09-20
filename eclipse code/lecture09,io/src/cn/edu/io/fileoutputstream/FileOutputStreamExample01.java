package cn.edu.io.fileoutputstream;

import java.io.*;

public class FileOutputStreamExample01 {
	public static void main(String args[]) {
		try {
			System.out.print("����һ���ַ�: ");
			int count, n = 512;
			byte buffer[] = new byte[n];
			FileOutputStream wf = new FileOutputStream("Output.txt");
			count = System.in.read(buffer);
			wf.write(buffer, 0, count); // д�������
			wf.close(); // �ر������
			System.out.println("�������ַ��ѱ��浽Output.txt!");
		} catch (IOException ioe) {
			System.out.println(ioe);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
