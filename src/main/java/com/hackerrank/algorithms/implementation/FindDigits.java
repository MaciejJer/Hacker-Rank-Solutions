package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class FindDigits {

  static int findDigits(int n) {
    int result = 0;
    int divisor = 10;
    int temp = n;
    int reminder;
    while (temp > 0) {
      reminder = temp % divisor;
      if (reminder != 0 && n % reminder == 0) {
        result++;
      }
      temp = temp / divisor;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      int n = in.nextInt();
      int result = findDigits(n);
      System.out.println(result);
    }
    in.close();
  }
}
