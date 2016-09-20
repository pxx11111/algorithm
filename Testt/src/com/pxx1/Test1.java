package com.pxx1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Test1 {
	
	static ArrayList<Map<String, Integer>> arrayList = new ArrayList<>();

	public static void main(String[] args) throws Exception {

		Scanner sca = new Scanner(System.in);

		int n = sca.nextInt();
		
		for (int i = 0; i < n; i++) {
			int j = sca.nextInt();
			Map<String, Integer>map=new HashMap<>();
			for (int j2 = 0; j2 < j; j2++) {
				
				
				String str = sca.next();
				int count = sca.nextInt();
				add(str, count,map);
				
			}
			
			
			
				//for(int i1=0;i1<arrayList.size();i1++)  {
				
				
				List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
				// 然后通过比较器来实现排序
				Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
					// 升序排序
					public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
						return o2.getValue().compareTo(o1.getValue());
					}
					
				}
				);
				      for (int k = 0; k < list.size(); k++) {
						
				    	  System.out.println(list.get(k).getKey()+":"+list.get(k).getValue());
					}
				
		         
				
			//}
				
				
				
				
				
			
		}
		
		
	
	}

	public static void add(String key, Integer value,Map<String, Integer> map) {
		if (map.get(key) != null) {
			map.put(key, map.get(key) + value);

		} else {
			map.put(key, value);
		}
	}
}