package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class SockMerchant {

  static int sockMerchant(int[] ar) {
    int result = 0;
    while (ar.length > 1) {
      int matcher = ar[0];
      int pairPosition = 0;
      for (int i = 1; i < ar.length; i++) {
        if (matcher == ar[i]) {
          pairPosition = i;
          break;
        }
      }
      if (pairPosition == 0) {
        int[] temp = new int[ar.length - 1];
        System.arraycopy(ar, 1, temp, 0, temp.length);
        ar = temp;
      } else {
        result++;
        if (pairPosition == ar.length - 1 && ar.length == 2) {
          break;
        }
        if (pairPosition == ar.length - 1 && ar.length > 2) {
          int[] temp = new int[ar.length - 2];
          System.arraycopy(ar, 1, temp, 0, temp.length);
          ar = temp;
        } else {
          int[] temp = new int[ar.length - 2];
          System.arraycopy(ar, pairPosition + 1, temp, pairPosition - 1,
              ar.length - pairPosition - 1);
          System.arraycopy(ar, 1, temp, 0, pairPosition - 1);
          ar = temp;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] ar = new int[n];
    for (int ar_i = 0; ar_i < n; ar_i++) {
      ar[ar_i] = in.nextInt();
    }
    int result = sockMerchant(ar);
    System.out.println(result);
  }
}
