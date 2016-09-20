package cn.edu.arrays;

import java.util.Arrays;

public class TestArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
          int a[] = {56,32,1,98,0,25,125};
          System.out.println(Arrays.toString(a));
          Arrays.sort(a);
          System.out.println(Arrays.toString(a));
          System.out.println("二分法查找：" + Arrays.binarySearch(a, 98));
	}

}
