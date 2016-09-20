package com.pxx20160821;

public class Test {
public static void main(String[] args) {
	int []A={1,2,3,9,1,2,3,1,2,3,6};
	System.out.println(singleNumber(A));
}
	public static int singleNumber(int[] A) {
        int ones = 0;//记录只出现过1次的bits
        int twos = 0;//记录只出现过2次的bits
        int threes;
        for(int i = 0; i < A.length; i++){
            int t = A[i];
            twos |= ones&t;//要在更新ones前面更新twos
            ones ^= t;
            threes = ones&twos;//ones和twos中都为1即出现了3次
            ones &= ~threes;//抹去出现了3次的bits
            twos &= ~threes;
        }
        return ones; 
    }
}
