package com.pxx;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
public static void main(String[] args) {
	int []array=new int[]{};
	Test3 ts=new Test3();
	ts.reOrderArray(array);
        
        }
public void reOrderArray(int [] array) {
	  if(array.length==0||array.length==1) return;
    int oddCount=0,oddBegin=0;
    int[] newArray=new int[array.length];
    for(int i=0;i<array.length;i++){
        if((array[i]&1)==1) oddCount++;
    }
    for(int i=0;i<array.length;i++){
        if((array[i]&1)==1) newArray[oddBegin++]=array[i];
        else newArray[oddCount++]=array[i];
    }
    for(int i=0;i<array.length;i++){
        array[i]=newArray[i];
    }
}
}
