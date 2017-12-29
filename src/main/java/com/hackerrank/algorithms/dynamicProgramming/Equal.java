package com.hackerrank.algorithms.dynamicProgramming;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Equal {

  //Chocolates for the colleagues in HackerRank
  public static void main(String args[]) throws Exception {
    BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream(
        "C:\\Users\\pit\\HackerRank\\Hacker-Rank-Solutions\\src\\main\\resources\\dynamicProgramming\\input15Equal.txt")));
    int T = Integer.parseInt(bfr.readLine());
    for (int i = 0; i < T; i++) {
      int colleagues = Integer.parseInt(bfr.readLine());
      String[] temp = bfr.readLine().split(" ");
      int[] chocolates = new int[colleagues];
      for (int j = 0; j < colleagues; j++) {
        chocolates[j] = Integer.parseInt(temp[j]);
      }
      System.out.println(iterate(chocolates));
    }
  }

  private static int[] whereToAdd(int[] ints) {
    int[] differenceAndIndex = {0, 0};
    int indexMax = 0;
    int indexMin = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < ints.length; i++) {
      if (max < ints[i]) {
        max = ints[i];
        indexMax = i;
      }
      if (min > ints[i]) {
        min = ints[i];
        indexMin = i;
      }
    }
    int difference = max - min;
    if (difference >= 5) {
      difference = 5;
    } else {
      if (difference >= 2) {
        difference = 2;
      } else {
        if (difference == 1) {
          difference = 1;
        }
      }
    }
    differenceAndIndex[0] = difference;
    differenceAndIndex[1] = indexMax;
    return differenceAndIndex;
  }

  private static int iterate(int[] chocolates) {
    int result = 0;
    int[] differenceAndIndex = whereToAdd(chocolates);
    while (differenceAndIndex[0] > 0) {
      for (int i = 0; i < chocolates.length; i++) {
        if (differenceAndIndex[1] != i) {
          chocolates[i] = chocolates[i] + differenceAndIndex[0];
        }
      }
      result++;
      differenceAndIndex = whereToAdd(chocolates);
    }
    return result;
  }
}
