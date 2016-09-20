package cn.edu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import cn.edu.sort.comparable.data.Ball;

public class TestDel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Ball> list = InitData();
		System.out.println(list);
		/*System.out.println("==============");
		for(int i=0;i<3;i++){
			System.out.println(list.remove(i));
		}
        System.out.println(list);*/
		Iterator<Ball> iterator = list.iterator();
		while(iterator.hasNext()){
			iterator.next();
			iterator.remove();
		}
		System.out.println(list);
	}

	public static List<Ball> InitData() {
		String[] colors = new String[]{"ºì","³È","»Æ","ÂÌ","Çà","À¶","×Ï"};
		Random rand = new Random(1);
        List<Ball> list = new ArrayList<Ball>();
        for(int i = 0;i<5;i++){
        	Ball ball = new Ball(i,colors[rand.nextInt(7)],i);
        	list.add(ball);
        }
        return list;
	}

}
