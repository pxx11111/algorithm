package cn.edu.io.fileoutputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
	// �ں����ڲ��������쳣�������쳣�׳������ⲿ
	public static void main(String[] args) throws IOException {
		String str = "Hello world!";
		File file = new File("test.txt"); // �����ļ�����
		// ͨ���ļ����󴴽��ļ����������
		// ���ӵڶ�������true��ָ�������ļ�׷�ӣ�Ĭ��Ϊ��׷��
		FileOutputStream fos = new FileOutputStream(file, true);

		// ������ַ�д�뵽�ļ���
		for (int i = 0; i < str.length(); i++) {
			fos.write(str.charAt(i));
		}
		fos.close(); // �ر���
	}
}
