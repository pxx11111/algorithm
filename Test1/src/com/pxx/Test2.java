package com.pxx;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;





public class Test2 {
public static void main(String[] args) {
	File file=new File("a.txt");
	if(file.exists())
	{   FileInputStream is;
	try {
		is = new FileInputStream(file);
		byte[] b = new byte[1024];
		int len = 0;
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
			while((len = is.read(b)) != -1){
				bos.write(b, 0, len);
			}
			//把字节数组输出流里的数据转换成字节数组
			String text = new String(bos.toByteArray());
		     System.out.println(text);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
		
	}
}
}
