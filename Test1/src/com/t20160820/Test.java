package com.t20160820;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	 public static void main(String[] args) {
		FileInputStream file;
		try {
			file = new FileInputStream(new File("a.txt"));
			BufferedReader buff=new BufferedReader(new InputStreamReader(file));
			String str=buff.readLine();
			System.out.println(str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
		
	}
	

