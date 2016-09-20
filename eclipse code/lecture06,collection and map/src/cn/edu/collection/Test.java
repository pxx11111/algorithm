package cn.edu.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       List list = new ArrayList();
       for(int i = 0;i<10;i++){
    	   list.add(i + ":" + (int)(Math.random()*10));
       }
       System.out.println(list);
       Set set = new HashSet();
       for(int i = 0;i<10;i++){
    	   set.add(i + ":" + (int)(Math.random()*10));
       }
       System.out.println(set);
       Map map = new HashMap();
       for(int i = 0;i<10;i++){
    	   map.put(i,(int)(Math.random()*100));
       }
       System.out.println(map);
	}

}
