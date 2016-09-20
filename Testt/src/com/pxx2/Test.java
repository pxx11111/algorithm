package com.pxx2;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Test {
public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	int n=sca.nextInt();
	
	ArrayList<HashMap<Integer, Integer>>arrayList=new ArrayList<>();
	int []energys=new int[n];
	for (int i = 0; i < n; i++) {
		int energy=sca.nextInt();
		energys[i]=energy;
	}
   int k=sca.nextInt();
   int d=sca.nextInt();
   int[] ks=new int[k];
   for (int i = 0; i < energys.length;i++) {
	   HashMap<Integer, Integer> hashMap=new HashMap<>();
	hashMap.put(energys[i], i);
    arrayList.add(hashMap);
 for(int i1=0;i1<arrayList.size();i1++)  {
		
		
		List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(hashMap.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
			
		}
		);
		for (int j = 0; j <list.size(); j++) {
			
		}
}
  
 
}



}	
}
