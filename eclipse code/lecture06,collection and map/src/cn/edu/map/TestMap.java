package cn.edu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import cn.edu.sort.comparable.data.Ball;

public class TestMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       Map<Integer,Ball> map = new HashMap<Integer,Ball>();
       map.put(1,new Ball(1,"ºì",1));
       map.put(2,new Ball(1,"»Æ",2));
       map.put(3,new Ball(1,"À¶",3));
       
       Set<Map.Entry<Integer,Ball>> entries = map.entrySet();
       for(Map.Entry<Integer, Ball> entry:entries){
    	   System.out.println(entry.getKey());
    	   Ball ball = entry.getValue();
    	   System.out.println(ball);
    	   System.out.println(entry.hashCode());
    	   if(ball.getR()==2){
    		   entry.setValue(new Ball(200,"ÂÌ",200));
    	   }
       }
	}

}
