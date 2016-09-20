package com.p360;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 
	while(sc.hasNext())
	{ ArrayList<HashMap<String,String>>list=new ArrayList<>();
		String line=sc.nextLine();
		String []lines=line.split(" ");
		int T=Integer.parseInt(lines[0]);
		int Max=Integer.parseInt(lines[1]);
	   for (int i = 0; i < T; i++) {
		   
			HashMap<String,String> map=new HashMap<>();
			String str=sc.nextLine();


			String[] sarr=str.split(" ");

			if(sarr[0].equals("new")||sarr[0].equals("del"))
			{
		     map.put(sarr[0],sarr[1]);
		     }
			if(sarr.equals("def"))
			{
				map.put(sarr[0], "0");
			}
		     list.add(map);
		
	}
	  ArrayList<Integer>arr=new ArrayList<>();

		for (int i = 0; i <list.size(); i++) {
			if(list.get(i).containsKey("new"))
			{
				Max=Max-Integer.valueOf(list.get(i).get("new"));
				if(Max<0)
					arr.add(Integer.MAX_VALUE);
				arr.add(Max);
			}
			if(list.get(i).containsKey("del"))
			{
				Max=Max+Integer.valueOf(list.get(i).get("del"));
				arr.add(Max);
			}
			if(list.get(i).containsKey("def"))
			{
				Max=Max+0;
				arr.add(Max);
			}
		}
for (Integer integer : arr) {
	if(integer==Integer.MAX_VALUE)
		System.out.println("NULL");
	System.out.println(integer);
}
}
}}
