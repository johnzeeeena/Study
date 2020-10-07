package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThreeDigitNumbers3 {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == i) {
                    continue;
                }
                for (int k = 0; k < 10; k++) {
                    if (k == j || k == i) {
                        continue;
                    }
                    System.out.println("" + i + j + k);
                }
            }
        }
    }
}

