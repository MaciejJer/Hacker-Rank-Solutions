package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class StairCase {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int temp = n;
    while (temp > 0) {
      for (int i = 0; i<(temp-1) ; i++) {
        System.out.print(" ");
      }
      for (int i = 0; i<=(n-temp ); i++) {
        System.out.print("#");
      }
      temp--;
      System.out.println("");
    }
  }
}
