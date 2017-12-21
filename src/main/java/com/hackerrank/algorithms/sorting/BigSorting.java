package com.hackerrank.algorithms.sorting;

import java.math.BigInteger;
import java.util.Scanner;

public class BigSorting {

  static void sort(String arr[]) {
    int start = 0;
    int end = arr.length - 1;
    quickSort(arr, start, end);
  }

  private static void quickSort(String arr[], int start, int end) {
    int i, j;
    BigInteger pivot;
    i = start;
    j = end;
    String temp;
    pivot = new BigInteger(arr[(start + end) / 2]);
    do {
      while (new BigInteger(arr[i]).compareTo(pivot) == -1) {
        i++;
      }
      while (pivot.compareTo(new BigInteger(arr[j])) == -1) {
        j--;
      }
      if (i <= j) {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    } while (i <= j);
    if (start < j) {
      quickSort(arr, start, j);
    }
    if (i < end) {
      quickSort(arr, i, end);
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String[] unsorted = new String[n];
    for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
      unsorted[unsorted_i] = in.next();
    }
    sort(unsorted);
    for (String i : unsorted) {
      System.out.println(i);
    }
  }
}
