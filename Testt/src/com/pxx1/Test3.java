package com.pxx1;
import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Map.Entry;

	public class Test3 {
		public static void main(String[] args) {
			Map<String,String> map=new HashMap<String,String>();
			map.put("1", "����");
			map.put("2", "����");
			map.put("3", "����");
			/*����һ ����������*/
			System.out.println("����һ��");
			Iterator iterator=map.entrySet().iterator();
	        while(iterator.hasNext()){      
	           Map.Entry<String, String> entry= (Entry<String, String>) iterator.next();
			   System.out.println("key:"+entry.getKey()+" value"+entry.getValue());  
			  }       
	        /*������*/
	        System.out.println("��������");
	        for (Map.Entry<String, String> m : map.entrySet()) {
	        	  System.out.println("key:"+m.getKey()+" value"+m.getValue());
	          } 
	      }
	}

