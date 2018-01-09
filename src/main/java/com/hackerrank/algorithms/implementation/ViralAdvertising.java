package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class ViralAdvertising {

  private static int viralAdvertising(int n) {
    int total = 0;
    int people = 5;
    for (int i = 1; i <= n; i++) {
      total = total + people/2;
      people = (people/2)*3;
    }
    return total;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = viralAdvertising(n);
    System.out.println(result);
    in.close();
  }
}
