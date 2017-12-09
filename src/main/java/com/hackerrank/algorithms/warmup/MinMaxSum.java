package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class MinMaxSum {

  public static void main(String[] args) {
    int max = 0;
    int min = Integer.MAX_VALUE;
    long sum = 0L;
    Scanner in = new Scanner(System.in);
    int[] arr = new int[5];
    for (int arr_i = 0; arr_i < 5; arr_i++) {
      arr[arr_i] = in.nextInt();
      if (max <= arr[arr_i]) {
        max = arr[arr_i];
      }
      if (min >= arr[arr_i]) {
        min = arr[arr_i];
      }
      sum = sum + arr[arr_i];
    }
    System.out.println(min + "= min, " + max + "= max," + sum + " =sum");
    System.out.println((sum-max) + " " + (sum-min));
  }
}
