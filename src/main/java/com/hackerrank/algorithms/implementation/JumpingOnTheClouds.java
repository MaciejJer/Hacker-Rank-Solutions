package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class JumpingOnTheClouds {

  static int jumpingOnClouds(int[] c) {
    int counter = 0;
    int index = 0;
    while (index < c.length-1) {
      if (index + 2 < c.length && c[index + 2] != 1) {
        index = index + 2;
        counter++;
      } else if (index + 1 < c.length && c[index + 1] != 1) {
        index++;
        counter++;
      }
    }
    return counter;
  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] c = new int[n];
    for (int c_i = 0; c_i < n; c_i++) {
      c[c_i] = in.nextInt();
    }
    int result = jumpingOnClouds(c);
    System.out.println(result);
    in.close();
  }

}
