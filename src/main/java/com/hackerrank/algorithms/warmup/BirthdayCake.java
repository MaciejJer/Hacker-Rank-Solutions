package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class BirthdayCake {

  private static int birthdayCakeCandles(int n, int[] ar) {
    int result = 0;
    int maxHight = 0;
    for (int i = 0; i < n; i++) {
      if (ar[i] > maxHight) {
        maxHight = ar[i];
      }
    }
    for (int j = 0; j < n; j++) {
      if (ar[j] == maxHight) {
        result++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] ar = new int[n];
    for (int ar_i = 0; ar_i < n; ar_i++) {
      ar[ar_i] = in.nextInt();
    }
    int result = birthdayCakeCandles(n, ar);
    System.out.println(result);
  }
}
