package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BreakingTheRecords {
    static int[] breakingRecords(int[] score) {
        int[] bestWorst = {score[0], score[0]};
        int decreaseCounter = 0;
        int increaseCounter = 0;
        for (int i = 1; i < score.length; i++) {
            if (bestWorst[0] < score[i]) {
                bestWorst[0] = score[i];
                increaseCounter++;
            }
            if (bestWorst[1] > score[i]) {
                bestWorst[1] = score[i];
                decreaseCounter++;
            }
        }
        bestWorst[0] = increaseCounter;
        bestWorst[1] = decreaseCounter;
        return bestWorst;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for (int score_i = 0; score_i < n; score_i++) {
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }


}
