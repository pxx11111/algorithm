package com.p20160824;

import java.util.ArrayList;

public class DanGao {
public static void main(String[] args) {
	
}

	public class Solution {
	    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
	        if(triangle==null)
	            return 0;
	        int first = triangle.get(0).get(0);//��һ����
	        if(triangle.size()==1)
	            return first;
	        //����ҪO(n)�ĸ����ռ䣬ֻ��Ҫ��ײ㳤�ȴ�С�ĸ����ռ�
	        int maxSize= triangle.get(triangle.size()-1).size();
	        int[] a = new int[maxSize];
	        a[0] = first;
	        int min = Integer.MAX_VALUE;
	        //����triangle
	        for(int i = 1;i<triangle.size();i++){
	            ArrayList<Integer> list = triangle.get(i);
	            int temp = a[0];
	            for(int j = 0;j<list.size();j++){
	                int minCost = j==0||j+1==list.size()?temp:Math.min(temp, a[j]);
	                temp = a[j];
	                a[j] = list.get(j)+minCost;
	                if(i+1==triangle.size()){
	                    //���һ��
	                    if(a[j]<min)
	                        min = a[j];
	                }
	            }
	        }
	        return min;
	    }
	}

}
