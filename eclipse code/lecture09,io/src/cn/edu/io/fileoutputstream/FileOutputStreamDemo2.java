package cn.edu.io.fileoutputstream;

import java.io.FileOutputStream;

public class FileOutputStreamDemo2 {
	// �ں����ڲ��������쳣�������쳣�׳������ⲿ
	public static void main(String[] args) throws Exception {
		String str = "I Love Java";
		// ͨ���ļ��������ļ����������
		FileOutputStream fos = new FileOutputStream("test1.txt");

		// ���ַ���ת��Ϊ�ֽ�����
		byte[] buffer = str.getBytes();
		// ���ֽ������а���������һ����д�뵽�ļ���
		fos.write(buffer);
		// �ر���
		fos.close();
	}
}
