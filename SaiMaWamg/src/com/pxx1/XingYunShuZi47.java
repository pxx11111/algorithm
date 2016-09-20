package com.pxx1;

import java.util.Scanner;


public class XingYunShuZi47 {


    public static void main(String[] args) {

        Solution1 s = new Solution1();

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {

            long num = sc.nextLong();

            s.getResult(num);

        }

        

        sc.close();

    }


}


class Solution1 {

    public void getResult(long num) {

        long dig = 0;

        long c = 0;

        long i = 1;

        while(c < num) {

            dig++;

            c += i <<= 1;

        }

        c -= i;

        c++;

        

        long s = num - c;

        String result = new String();

        for(long k = 0; k < dig; k++) {

            if((s & 1l) == 1l) {

                result = "7" + result;

            } else {

                result = "4" + result;

            }

            s >>>= 1;

        }

        System.out.println(result);

    }

    
}
