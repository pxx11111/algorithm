package cn.edu.io.copyfile;

import java.io.*;

class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		File srcFile = new File("FileDemo.java"); // 源文件对象
		File destFile = new File("dest.dat"); // 目标文件对象
		// 使用源文件对象创建文件输入流对象
		FileInputStream fis = new FileInputStream(srcFile);
		// 使用目标文件对象创建文件输出流对象
		FileOutputStream fos = new FileOutputStream(destFile);
		byte[] buf = new byte[1024]; // 创建字节数组，作为临时缓冲
		System.out.println("开始复制文件...");
		while (fis.read(buf) != -1) { // 循环从文件输入流中读取数据
			fos.write(buf); // 写入到文件输出流中
		}
		System.out.println("文件复制成功！");
		fis.close(); // 关闭流
		fos.close();
	}
}
