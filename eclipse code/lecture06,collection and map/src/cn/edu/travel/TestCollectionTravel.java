package cn.edu.travel;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import cn.edu.sort.comparable.data.Ball;

public class TestCollectionTravel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] colors = new String[]{"ºì","³È","»Æ","ÂÌ","Çà","À¶","×Ï"};
		Random rand = new Random();
		Set<Ball> set = new HashSet<Ball>();
		for(int i=5;i>0;i--){
			Ball ball = new Ball(i,colors[rand.nextInt(7)],i);
			set.add(ball);
		}
		Ball[] balls = new Ball[set.size()];
		set.toArray(balls);
        System.out.println(balls[1]);
        System.out.println("=========================");
        for(int i=0;i<set.size();i++){
        	System.out.println(balls[i]);
        }
        System.out.println("=========================");
        for(Ball ball:set){
        	System.out.println(ball);
        }
        System.out.println("=========================");
        Iterator<Ball> iterator = set.iterator();
        while(iterator.hasNext()){
        	Object ball = iterator.next();
        	System.out.println(ball);
        }
	}

}
