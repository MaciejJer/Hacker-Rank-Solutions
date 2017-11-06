package com.hackerrank.codility;

public class ArrayOddsPairs {

  public static void main(String[] args) {
    int A[] = {11, 11, 10, 3, 9, 3, 9, 7, 5, 10, 7, 5, 3, 3, 9, 9, 11, 13, 11, 9, 9, 9, 9};
    int result = 0;
    for (int i : A) {
      System.out.print(" i before = " + i + " " + Integer.toBinaryString(i));
      result = result ^ i;
      System.out.println("         result = " + result + " " + Integer.toBinaryString(result));
    }
    System.out.println("Result is " + result);
  }
}

