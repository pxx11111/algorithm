package com.pxx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int n = 0;
        ArrayList<Double> list = new ArrayList<Double>();
        Scanner cin = new Scanner(System.in);
        if (cin.hasNext()) {
            n = cin.nextInt();
        }
        while (cin.hasNext()) {
            list.add(cin.nextDouble());
            if (list.size() == n) break;
        }
        Collections.sort(list);

        double len = 0;
        for (int i = 1; i <= list.size(); i++) {
            double num = list.get(list.size() - i);
            len += Math.sqrt(num * num - 1);
            if (len > 10) {
                System.out.println(i);
                break;
            }
        }

    }

}
