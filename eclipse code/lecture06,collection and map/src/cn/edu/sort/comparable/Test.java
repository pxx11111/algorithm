package cn.edu.sort.comparable;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import cn.edu.sort.comparable.data.Ball;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] colors = new String[]{"��","��","��","��","��","��","��"};
		//1. ����set����ظ�Ԫ�أ�
		Set set = new HashSet();
		set.add(new Ball(100,colors[1],20));
		set.add(new Ball(100,colors[1],30));
		set.add(new Ball(100,colors[1],30));
		set.add(new Ball(100,colors[1],30));
		System.out.println(set);
		//2. ����Set��Ԫ��˳��
		/*Random rand = new Random(1);
		Set set = new HashSet();
		for(int i =0;i<5;i++){
			Ball ball = new Ball(i,colors[rand.nextInt(7)],i);
			set.add(ball);
		}
		System.out.println(set);*/
	}

}
