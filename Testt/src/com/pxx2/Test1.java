package com.pxx2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test1 {
public static void main(String[] args) {

	Scanner sca=new Scanner(System.in);
	Set<String>str=new HashSet<>();
   while(sca.hasNextLine()) 
   {
	   String str1=sca.next();
	   str.add(str1);
   }
     System.out.println(str.size());
 
   
}
	
}


