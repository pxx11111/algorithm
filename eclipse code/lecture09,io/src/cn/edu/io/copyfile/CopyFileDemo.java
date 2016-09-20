package cn.edu.io.copyfile;

import java.io.*;

class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		File srcFile = new File("FileDemo.java"); // Դ�ļ�����
		File destFile = new File("dest.dat"); // Ŀ���ļ�����
		// ʹ��Դ�ļ����󴴽��ļ�����������
		FileInputStream fis = new FileInputStream(srcFile);
		// ʹ��Ŀ���ļ����󴴽��ļ����������
		FileOutputStream fos = new FileOutputStream(destFile);
		byte[] buf = new byte[1024]; // �����ֽ����飬��Ϊ��ʱ����
		System.out.println("��ʼ�����ļ�...");
		while (fis.read(buf) != -1) { // ѭ�����ļ��������ж�ȡ����
			fos.write(buf); // д�뵽�ļ��������
		}
		System.out.println("�ļ����Ƴɹ���");
		fis.close(); // �ر���
		fos.close();
	}
}
