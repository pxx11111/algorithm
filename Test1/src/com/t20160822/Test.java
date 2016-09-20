package com.t20160822;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class Test {
public static void main(String[] args) {
	ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	list=levelOrderBottom();
	for (ArrayList<Integer> arrayList : list) {
		for (Integer integer : arrayList) {
			System.out.print(integer+" ");
		}
		System.out.println();
	}
}
public static ArrayList<ArrayList<Integer>> levelOrderBottom() {
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    
     
   
     
    for (int i = 0; i < 10; i++) {
    	ArrayList<Integer>arr=new ArrayList<>();
		for (int j = 0; j < 10; j++) {
			arr.add(i);
		}
	
        
         
        //一层遍历完了 把这for循环里的本层 加入result的0位置
        result.add(0,arr);//index at which the specified element is to be inserted
    }
     
     
    return result;
}
}
