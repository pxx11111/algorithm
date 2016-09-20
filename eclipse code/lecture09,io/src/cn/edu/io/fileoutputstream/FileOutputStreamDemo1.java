package cn.edu.io.fileoutputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
	// 在函数内部不进行异常处理，将异常抛出函数外部
	public static void main(String[] args) throws IOException {
		String str = "Hello world!";
		File file = new File("test.txt"); // 创建文件对象
		// 通过文件对象创建文件输出流对象
		// 附加第二个参数true，指定进行文件追加，默认为不追加
		FileOutputStream fos = new FileOutputStream(file, true);

		// 逐个将字符写入到文件中
		for (int i = 0; i < str.length(); i++) {
			fos.write(str.charAt(i));
		}
		fos.close(); // 关闭流
	}
}
