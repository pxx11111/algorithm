package cn.edu.travel;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import cn.edu.sort.comparable.data.Ball;

public class TestListIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] colors = new String[]{"ºì","³È","»Æ","ÂÌ","Çà","À¶","×Ï"};
		Random rand = new Random(1);
        List<Ball> list = new ArrayList<Ball>();
        for(int i = 0;i<5;i++){
        	Ball ball = new Ball(i,colors[rand.nextInt(7)],i);
        	list.add(ball);
        }
        ListIterator<Ball> it = list.listIterator();
        while(it.hasNext()){
        	System.out.println("index=" + it.nextIndex() + "," + it.next());
        }
        System.out.println("=========================");
        it = list.listIterator(5);
        while(it.hasPrevious()){
        	System.out.println("index=" + it.previousIndex() + "," + it.previous());
        }
	}

}
