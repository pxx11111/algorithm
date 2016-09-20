package cn.edu.io.buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInAndOutStreamDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream file_in = new FileInputStream("k2000.jpg");
		BufferedInputStream bufIn = new BufferedInputStream(file_in);
		FileOutputStream file_out = new FileOutputStream("new.bmp");
		BufferedOutputStream bufOut = new BufferedOutputStream(file_out);
	    int by = 0;
	    while((by = bufIn.read())!=-1){
	    	bufOut.write(by);
	    }
	    bufIn.close();
	    bufOut.close();
	}

}
