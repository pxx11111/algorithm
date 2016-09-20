package com.t2016818;

public class Test2 {
public static void main(String[] args) {
	int n=3;
	System.out.println(jumpFloor(n));
}
public static int jumpFloor(int number) {
	 if(number <= 0)
         return 0;
     else if(number == 1)
         return 1;
     else if(number == 2)
         return 2;
     else
         return jumpFloor(number-1) + jumpFloor(number-2);
}
}