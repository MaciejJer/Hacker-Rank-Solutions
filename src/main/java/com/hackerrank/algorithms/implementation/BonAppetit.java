package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BonAppetit {

  private static int bonAppetit(int n, int k, int b, int[] ar) {
    int total = 0;
    for (int i : ar) {
      total = total + i;
    }
    total = (total - ar[k]) / 2;
    return b - total;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] ar = new int[n];
    for (int ar_i = 0; ar_i < n; ar_i++) {
      ar[ar_i] = in.nextInt();
    }
    int b = in.nextInt();
    int result = bonAppetit(n, k, b, ar);
    if (result > 0) {
      System.out.println(result);
    } else {
      System.out.println("Bon Appetit");
    }
  }
}
