package com.hackerrank.codility;

public class MissingElement {

  public static void main(String[] args) {
    int A[] = {1, 2, 9, 3, 8, 7, 4, 5, 11, 20, 12, 19, 13,10, 18, 14, 17, 15, 16};
    int aSum = 0;
    int nSum = 0;
    for (int aA : A) {
      aSum += aA;
    }
    for (int i = 1; i <= A.length +1; i++) {
      nSum += i;
    }
    System.out.println("asum = " + aSum + " nSum = " + nSum);
    System.out.println(nSum-aSum);
  }
}
