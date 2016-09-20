package com.pxx1;

import java.util.ArrayList;

import java.util.Scanner;


public class ErJinZhiHe {


    public static void main(String[] args) {

        Solution s = new Solution();

        s.doBefore();

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {

            int n = sc.nextInt();

            s.getResult(n);

        }

        sc.close();

    }


}


class Solution {

    public ArrayList<int[]> curResult = new ArrayList<int[]>();

    public boolean mark = false;

    

    public void doBefore() {

        int last = 0;

        for(int i = 1; i <= 100000; i++) {

            if(f(i) == g(i)) {

                int[] arr = {i, ++last};

                curResult.add(arr);

            }

        }

    }

    

    public void getResult(int n) {

        

        int result = 1;

        for(int i = 0; i < curResult.size(); i++) {

            if(curResult.get(i)[0] <= n) {

                result = curResult.get(i)[1];

            } else

                break;

            

        }

        System.out.println(result);

        

    }

//        int curMostClosed = 1;

//        int result = 1; //当前结果是0；

//        

//        if (mark) {

//            for (int k : curResult.keySet()) {

//                if (k > curMostClosed && k <= n) {

//                    curMostClosed = k;

//                }

//            }

//            result = curResult.get(curMostClosed);

//        }

//        mark = true;

//        

//        for(int i = curMostClosed + 1; i <= n; i++) {

//            if(f(i) == g(i))

//                result++;

//        }

//        curResult.put(n, result);

//        

//        System.out.println(result);

//    }

    private int f(int n ) {

        int result = 0;

        while(n != 0) {

            result += n % 10;

            n /= 10;

        }

        return result;

    }

    private int g(int n ) {

        int result = 0;

        while(n != 0) {

            result += (n & 1) == 1 ? 1 : 0;

            n >>>= 1;

        }

        return result;

    }

    
}
