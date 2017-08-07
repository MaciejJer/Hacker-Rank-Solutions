package com.hackerrank.algorithms;

import java.util.Scanner;

public class Diagonals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte n = scan.nextByte();
        int array[][] = new int [n][n];
        int dig = 0;
        int dig2 = 0;
        for (int ai = 0; ai <n ; ai++){
            for (int aj = 0; aj < n; aj ++){
                array[ai][aj] = scan.nextInt();
                if (aj == ai) {
                    dig = dig + array[ai][aj];
                }
                if (aj == n-ai-1){
                    dig2 = dig2 + array[ai][aj];
                }
            }
        }
        System.out.println(Math.abs(dig-dig2));
    }
}
