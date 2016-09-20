package com.pxx;

public class YuanXingMoShi{
	public static void main(String[] args) {
		
	
	concreteprototype  concreteprototype=new concreteprototype();
	concreteprototype concreteprototype1=(concreteprototype) concreteprototype.clone();
	concreteprototype1.show();
}}
class Prototype implements Cloneable{

	public Prototype clone(){
		Prototype prototype=null;
		try {
			prototype=(Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prototype;
	}
	
}
class concreteprototype extends Prototype{
	public void show(){
		System.out.println("success!");
	}
}