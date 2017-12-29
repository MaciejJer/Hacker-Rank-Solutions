package com.hackerrank.algorithms.strings;

import java.util.Arrays;
import java.util.Scanner;

public class MarsExploration {

    static int marsExploration(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length - 2; i = i + 3) {
            if (chars[i] != 83) {
                result++;
            }
            if (chars[i + 1] != 79) {
                result++;
            }
            if (chars[i + 2] != 83) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }
}
