package com.p20160826;

import java.util.ArrayList;
import java.util.Arrays;

public class t4num {
public static void main(String[] args) {
	Solution s=new Solution();
	int []num={1,0,-1,0,-2,2};
	int target=0;
	ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
	arr=s.fourSum(num, target);
	System.out.println(arr);
}
}

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        ArrayList<ArrayList<Integer>> array=new ArrayList();
        if(num == null||num.length < 4)
            return array;
        Arrays.sort(num);
        ArrayList<Integer> list=new ArrayList();
        for(int i=0;i<=num.length-4;i++)
            {
            if(i>0&&num[i] == num[i-1])
                continue;
            int begin=i+1;
            int threesum=target-num[i];
            for(int j=begin;j<=num.length-3;j++)
                {
                if(j>begin&&num[j] == num[j-1])
                    continue;
                int left=j+1;
                int right=num.length-1;
                while(left<right)
                    {
                    int ans=num[j]+num[left]+num[right];
                    if(ans == threesum)
                        {
                        list.add(num[i]);
                        list.add(num[j]);
                        list.add(num[left]);
                        list.add(num[right]);
                        array.add(list);
                        list=new ArrayList();
                        left++;
                        while(left<right&&num[left] == num[left-1])
                            left++;
                        right--;
                        while(left<right&&num[right] == num[right+1])
                            right--;
                    }else if(ans<threesum)
                        left++;
                        else
                        right--;
                }
            }
        }
         return array;
    }
}