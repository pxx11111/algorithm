package com.pxx20160821;

public class Test {
public static void main(String[] args) {
	int []A={1,2,3,9,1,2,3,1,2,3,6};
	System.out.println(singleNumber(A));
}
	public static int singleNumber(int[] A) {
        int ones = 0;//��¼ֻ���ֹ�1�ε�bits
        int twos = 0;//��¼ֻ���ֹ�2�ε�bits
        int threes;
        for(int i = 0; i < A.length; i++){
            int t = A[i];
            twos |= ones&t;//Ҫ�ڸ���onesǰ�����twos
            ones ^= t;
            threes = ones&twos;//ones��twos�ж�Ϊ1��������3��
            ones &= ~threes;//Ĩȥ������3�ε�bits
            twos &= ~threes;
        }
        return ones; 
    }
}
