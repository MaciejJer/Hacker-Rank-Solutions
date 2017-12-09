package com.hackerrank.codility;

public class TapeEquilibrium {

  public static void main(String[] args) {
    int A[] = {3, 1, 2, 4, 3};
    int P = A.length - 1;
    int res1[] = new int[P];
    int res2[] = new int[P];
    res1[0] = A[0];
    res2[0] = A[P];
    int min = Integer.MAX_VALUE;
    for (int i = 1; i < P; i++) {
      res1[i] = res1[i - 1] + A[i];
      res2[i] = res2[i - 1] + A[P - i];
    }
    for (int i = 0; i < P; i++) {
      min = Math.min(Math.abs(res1[i] - res2[P - i - 1]), min);
    }
    for (int i : res1) {
      System.out.print(i + " ");
    }
    System.out.println("======================");
    for (int i : res2) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println(min);
  }
}
