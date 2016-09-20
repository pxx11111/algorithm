package cn.edu.io.fileoutputstream;

import java.io.FileOutputStream;

public class FileOutputStreamDemo2 {
	// 在函数内部不进行异常处理，将异常抛出函数外部
	public static void main(String[] args) throws Exception {
		String str = "I Love Java";
		// 通过文件名创建文件输出流对象
		FileOutputStream fos = new FileOutputStream("test1.txt");

		// 将字符串转化为字节数组
		byte[] buffer = str.getBytes();
		// 将字节数组中包含的数据一次性写入到文件中
		fos.write(buffer);
		// 关闭流
		fos.close();
	}
}
