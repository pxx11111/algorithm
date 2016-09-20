package cn.edu.io.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedInAndOut {

	public static void main(String[] args) throws Exception {
		File readFile = new File("src/cn/edu/io/buffer/BufferedInAndOut.java"),
		     writeFile = new File("out.txt");
		FileReader inOne = new FileReader(readFile);
		BufferedReader inTwo = new BufferedReader(inOne);
		FileWriter tofile = new FileWriter(writeFile);
		BufferedWriter out = new BufferedWriter(tofile);
		int i = 0;String s = null;
		while((s = inTwo.readLine())!=null){
			i++;
			out.write("/*" + i + "*/" + s);//–¥»Î––±‡∫≈
		    out.newLine();
		}
		out.flush();
		out.close();
		tofile.close();
		inOne = new FileReader(writeFile);
		inTwo = new BufferedReader(inOne);
		while((s = inTwo.readLine())!=null){
			System.out.println(s);
		}
		inOne.close();
		inTwo.close();
	}

}
