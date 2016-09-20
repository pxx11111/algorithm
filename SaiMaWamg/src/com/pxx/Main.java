package com.pxx;


import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            if (str1 == null || str2 == null) {
                return;
            }
            int len1 = str1.length();
            int len2 = str2.length();
            if (len1 == 0 || len2 == 0 || len1 != len2) {
                System.out.println(0+"%");
            }

            char charTmp;
            StringBuilder builder = new StringBuilder();
            int i, j;
            for (i = 0; i < len1; i++) {
                charTmp = str1.charAt(i);
                if ((charTmp >= '0' && charTmp <= '9') || (charTmp >= 'a' && charTmp <= 'z')
                        || (charTmp >= 'A' && charTmp <= 'Z')) {
                    charTmp = '1';
                } else {
                    charTmp = '0';
                }
                builder.append(charTmp);
            }
            str1 = builder.toString();
            char charTmpTwo;
            int count = 0;
            for (i = 0, j = 0; i < len1 && j < len2;
                 i++, j++) {
                charTmp = str1.charAt(i);
                charTmpTwo = str2.charAt(j);
                if (charTmp == charTmpTwo) {
                    count += 1;
                } else
                    continue;
            }

            double resultTmp = 100*((double) count) / len1;
            System.out.printf("%.2f%%",resultTmp);
        }
    }
}