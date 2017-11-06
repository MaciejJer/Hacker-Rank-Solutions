package com.hackerrank.codility;

public class ArrayShift {

  public static void main(String[] args) {
    int A[] = {3, 8, 9, 7, 6};
    if (A.length == 0) {
      System.out.println(A);
    }
    for (int i = 0; i < 3; i++) {
      int B[] = new int[A.length];
      B[0] = A[A.length - 1];
      System.arraycopy(A, 0, B, 1, A.length - 1);
      System.arraycopy(B, 0, A, 0, B.length);
    }
    System.out.println();
  }
}
