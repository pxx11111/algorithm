package cn.edu.jp.array;

import java.lang.reflect.Array;

public class ArrayTester1 {
   public static void main(String[] args) throws ClassNotFoundException{
	   Class clazz = Class.forName("java.lang.String");
	   //create a array and its length is 10.
	   Object array = Array.newInstance(clazz, 10);
	   //set value  with "hello" and its index is 5.
	   Array.set(array, 5, "hello");
	   String s = (String) Array.get(array, 5);
       System.out.println(s);
   }
}
