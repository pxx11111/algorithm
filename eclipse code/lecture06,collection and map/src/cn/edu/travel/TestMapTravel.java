package cn.edu.travel;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import cn.edu.sort.comparable.data.Ball;

public class TestMapTravel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] colors = new String[]{"��","��","��","��","��","��","��"};
		Random rand = new Random();
		Map<Ball,Ball> map = new HashMap<Ball,Ball>();
		for(int i=5;i>0;i--){
			Ball ball = new Ball(i,colors[rand.nextInt(7)],i);
			map.put(ball, ball);
		}
		Ball obj = new Ball(5,"��",300);
		map.put(obj, obj);
		
		Ball findBall = new Ball(5,"��",5);
		Ball result = map.get(findBall);
		System.out.println(result);
		System.out.println("===1.������ʽһ����forѭ��===");
		Object[] keys = map.keySet().toArray();
		for(int i = 0;i<keys.length;i++){
			Object key = keys[i];
			System.out.println(map.get(key));
		}
		System.out.println("===2.������ʽ��===");
		for(Ball ball:map.keySet()){
			System.out.println(ball);
		}
		System.out.println("===3.������ʽ��===");
		Iterator<Ball> iterator = map.keySet().iterator();
		while(iterator.hasNext()){
			Object key = iterator.next();
			System.out.println(map.get(key));
		}
		System.out.println("===4.������ʽ��===");
		for(Map.Entry<Ball, Ball> entry:map.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
