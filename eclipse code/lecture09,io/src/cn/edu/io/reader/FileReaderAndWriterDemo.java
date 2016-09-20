package cn.edu.io.reader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriterDemo {
   //≤‚ ‘FileReader”ÎFileWriter
	public static void main(String[] args) throws IOException {
		File file1 = new File("src/cn/edu/io/reader/FileReaderAndWriterDemo.java");
		File file2 = new File("newfile.txt");
		FileReader fr = new FileReader(file1);
		FileWriter fw = new FileWriter(file2);
		int n,i=0;
		int len = (int) file1.length();
		char[] ch = new char[len];
		while((n = fr.read())!=-1){
			ch[i]=(char) n;
			i++;
		}
		fw.write(ch);
		fw.close();
		fr.close();
		FileReader fr2 = new FileReader(file2);
		while((n=fr2.read())!=-1){
			System.out.print((char)n);
		}
	}

}
