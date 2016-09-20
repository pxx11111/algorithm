package com.pxx;
import java.util.*;
public class ZuiGaoFen {
    static int[] scoreList;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int stuNum = scanner.nextInt();
            scoreList = new int[stuNum];
            int doNum = scanner.nextInt();
            for (int i = 0; i < stuNum; i++) {
                scoreList[i] = scanner.nextInt();
            }
            char type;
            String s;
            int arg1,arg2;
            for (int i = 0; i < doNum; i++) {
                s = scanner.next();
                type = s.charAt(0);
                arg1 = scanner.nextInt();
                arg2 = scanner.nextInt();
                if (type == 'Q') {
                    if (arg1 > arg2) {
                        int temp = arg1;
                        arg1 = arg2;
                        arg2 = temp;
                    }
                    printMaxScore(arg1, arg2);
                }else if (type == 'U') {
                    scoreList[arg1 - 1] = arg2;
                }
            }
            //System.out.println("end once");
        }
        scanner.close();
    }
     
    static void printMaxScore(int start, int end) {
        int maxScore = scoreList[start - 1];
        for (int i = start; i < end; i++) {
            if (scoreList[i] > maxScore) {
                maxScore = scoreList[i];
            }
             
        }
        System.out.println(maxScore);
    }
 
}