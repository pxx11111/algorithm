package com.pxx;

public class TwofindTwo {
	public static Integer findOnlyNum1(int[] array){
		int result = 0;
		for(int i = 0 ;i<array.length;i++){
			result^=array[i];
		}
		return result;
	}
	public static void main(String[] args) {
    int []array={2,3,5,1,2,3,5,1,56,34};		
	int result=findOnlyNum1(array);
	String binaryResult = Integer.toBinaryString(result);
	int index = binaryResult.length() - (binaryResult.lastIndexOf("1")+1);
	int result1 = 0;
	int result2 = 0;
	for(int i =0;i<array.length;i++){
		if(((array[i]>>index)&1)==1){
			result1^= array[i];
		}else{
			result2^=array[i];
		}
	}
	System.out.println(result1+" "+result2);
}}
