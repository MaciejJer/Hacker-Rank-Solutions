package com.hackerrank.codility;

public class ArrayCheckPermutation {

  public int solution(int[] A) {
    int sumA = 0;
    int sumAll = 0;
    if (A.length == 1) {
      return 1;
    }
    for (int i = 0; i < A.length; i++) {
      sumA += A[i];
      sumAll += i + 1;
    }
    if (sumA - sumAll == 0) {
      return 1;
    }
    return 0;
  }
}
