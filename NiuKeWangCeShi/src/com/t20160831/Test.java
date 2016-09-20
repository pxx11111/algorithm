package com.t20160831;

public class Test extends parents {
 public void min(){
	 System.out.println("s");
 }
 public void min2(){
	 System.out.println("s1");
 }
 public static void main(String[] args) {
	parents p=new Test();
	p.min();
	
}
}
class parents{
	int a=3;
	public void min(){
		System.out.println("p");
	}
	
}