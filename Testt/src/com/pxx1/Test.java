package com.pxx1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Test {
public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	ArrayList<String> arrayList=new ArrayList<>();
	int n=sca.nextInt();
	
	for(int i=0;i<n;i++)
	{
		int j=sca.nextInt();
		for (int j2 = 0; j2 < j; j2++) {
			int flag=0;
			String str=sca.nextLine();
			arrayList.add(str);
				}
		for (String string : arrayList) {
			String[] str=string.split(" ");
		    
		}
	}
	
	//System.out.println(hashmap.get("mike").toString());
	
}
}
