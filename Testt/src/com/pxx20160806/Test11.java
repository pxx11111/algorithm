package com.pxx20160806;

public class Test11 {
public static void main(String[] args) {
	int a, b;
    for (a = 1, b = 1; a <= 100; a++) { if (b >= 20)
            break;
        if (b % 3 == 1) {
            b += 3;
            continue;
        }
        b -= 5;
    }
    System.out.println(b);
}
}
