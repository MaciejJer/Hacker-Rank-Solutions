package com.hackerrank.algorithms.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

  public static void main(String[] args) {
    int negative = 0;
    int zeros = 0;
    int positive = 0;
    String FORMATTER = "#0.000000";
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for (int arr_i = 0; arr_i < n; arr_i++) {
      arr[arr_i] = in.nextInt();
      if (arr[arr_i] > 0) {
        positive++;
      } else {
        if (arr[arr_i] < 0) {
          negative++;
        } else {
          if (arr[arr_i] == 0) {
            zeros++;
          }
        }
      }
    }
    System.out.printf("%.3f\n%.3f\n%.3f\n", positive/(double)n, negative/(double)n, zeros/(double)n);
    System.out.println(new DecimalFormat(FORMATTER).format((float) positive / n));
    System.out.println(new DecimalFormat(FORMATTER).format((float) negative / n));
    System.out.println(new DecimalFormat(FORMATTER).format((float) zeros / n));
  }
}
