package com.t20160822;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		int[]num={1,2,3};
		ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
		arr=permute(num);
		for (ArrayList<Integer> arrayList : arr) {
			for (Integer integer : arrayList) {
				System.out.print(integer+" ");
			}
			System.out.println();
		}
	}
	
	    public static ArrayList<ArrayList<Integer>> permute(int[] num)
	    {
	        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	        if(num == null || num.length == 0)
	            return result;
	        int n = num.length;
	        perm(num,0,n,result);
	        return result;
	    }
	     
	    private static void perm(int[] num,int k,int m,ArrayList<ArrayList<Integer>> result)
	    {
	        int i;
	        if(k == m)
	        {
	            ArrayList<Integer> temp = new ArrayList<>();
	            for(i = 0;i < m;i++)
	                temp.add(num[i]);
	                result.add(temp);
	        }
	        else
	        {
	            for(i = k;i < m;i++)
	            {
	                swap(num,i,k);
	                perm(num,k+1,m,result);
	                swap(num,i,k);
	            }
	        }
	    }
	     
	    private static void swap(int[] num,int i,int j)
	    {
	        int temp = num[i];
	        num[i] = num[j];
	        num[j] = temp;
	    }
	}

	    


   

