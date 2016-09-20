package cn.edu.io.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		int size;
		/**
		 * ----绝对路径
			*注意：相对路径的起始处无斜杆"/";
			例如：filepath="resource/train.txt";
			而不是filepath="/resource/train.txt"; //error!
			简单来说就是 路径的拼接 来组成要读取文件的绝对路径
			----相对路径
			使用java project环境，使用java.io用相对路径读取文件的例子：
			 *目录结构：
			  DecisionTree
			            |___src
			                 |___com.decisiontree.SamplesReader.java
			            |___resource
			                 |___train.txt,test.txt
			 *SamplesReader.java:
			  String filepath="resource/train.txt";//注意filepath的内容；
			  File file=new File(filepath);
			  ……
			 
		 */
		FileInputStream f = new FileInputStream("src/cn/edu/io/fileinputstream/FileInputStreamDemo.java");
		//FileInputStream f = new FileInputStream("FileDemo.java");
		System.out.println("文件大小：" + (size =f.available())+ "字节。");
		int n = size/3;
		System.out.println("第一页，一次性读取" + n +"个字节。");
		for(int i=0;i<n;i++){
			System.out.print((char)f.read());
		}
		System.out.println("未读取字节数" + f.available());
		System.out.println("再次读取" + n + "个字节，存到字节数组中");
		byte[] b = new byte[n];
		if(f.read(b)!=n){
			System.err.println("读取" + n + "个字节失败");
		}
		System.out.println(new String(b,0,n));
		System.out.println("现在未读取的字节数："+ (size = f.available()) + "个字节。");
		System.out.println("在未读取的字节数中，让文件指针跳过一般，只读取最后一半。");
		System.out.println("现在未读取的字节数："+  f.available() + "个字节。");
		f.skip(size/2);
		if(f.read(b,n/2,n/2)!=n/2){
			System.err.println("读取" + n/2 + "个字节失败");
		}
		System.out.println(new String(b,0,b.length));
		System.out.println("现在未读取的字节数："+  f.available() + "个字节。");
		f.close();
	}
}
