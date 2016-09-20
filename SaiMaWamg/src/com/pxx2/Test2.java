package com.pxx2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Test2 {
	public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	
	while(sca.hasNext())
	{  
	   int time=sca.nextInt();
	   int n=sca.nextInt();
	   int []ti=new int[n];
		int []ki=new int[n];
		int []arry=new int[n];
		int sumti=0;
		int sumki=0;
	   for(int i=0;i<n;i++)
	   { 
		   ti[i]=sca.nextInt();
		   sumti+=ti[i];
	 }
	   for(int i=0;i<n;i++)
	   { 
		   ki[i]=sca.nextInt();
		   sumki+=ki[i];
	 }
	   HashMap<Integer, Integer> hash=new HashMap<>(); 
	   for(int i=0;i<n;i++)
	   {   
		   arry[i]=ki[i]/ti[i];
		   hash.put(i, arry[i]);
	 }
	   List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(hash.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
			
		}
		);
	  
	   if(sumti<=time)
		   {
		   System.out.println(sumki); }else{
			   int sumti1=0;
			   int sumki1=0;
			   for (int i = 0; i < list.size(); i++) {
				  
				sumti1+=ti[list.get(i).getKey()];
				if(sumti1<time)
				{
					sumki1+=ki[list.get(i).getKey()];
				}
				
				
			}
			   System.out.println(sumki1);
		   }  
	   
	}
	
	}

}
