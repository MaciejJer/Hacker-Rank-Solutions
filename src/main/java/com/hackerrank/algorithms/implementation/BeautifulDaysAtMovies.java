package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BeautifulDaysAtMovies {

  private static int beautifulDays(int i, int j, int k) {
    int result = 0;
    for (int m = i; m <= j; m++) {
      if (Math.abs(m - reversedX(m)) % k == 0) {
        result++;
      }
    }
    return result;
  }

  private static int reversedX(int x) {
    int reversedX = 0;
    int divisor = 10;
    while (x > 0) {
      reversedX = reversedX * divisor + x % divisor;
      x = x / divisor;
    }
    return reversedX;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i = in.nextInt();
    int j = in.nextInt();
    int k = in.nextInt();
    int result = beautifulDays(i, j, k);
    System.out.println(result);
    in.close();
  }
}
