package com.hackerrank.algorithms.implementation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SherlockAndSquares {

    static Set<Integer> precalculated = new HashSet<>();
    static int squares(int a, int b) {
        int counter = 0;
        int newA = (int)Math.sqrt((double) a);
        int newB = (int)Math.sqrt((double) b);
        for (int i=newA; i<=newB; i++){
            if (precalculated.contains(i*i)){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int squareValue = 0;
        int value = 0;
        while (squareValue < 1000000001){
            squareValue = value*value;
            precalculated.add(squareValue);
            value++;
        }
        for (int a0 = 0; a0 < q; a0++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int result = squares(a, b);
            System.out.println(result);
        }
        in.close();
    }
}
