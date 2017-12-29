package com.hackerrank.algorithms.implementation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockMerchantII {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = 0;
    Set<Integer> socks = new HashSet<>();
    for (int ar_i = 0; ar_i < n; ar_i++) {
      int current = in.nextInt();
      if (!socks.add(current)) {
        result++;
        socks.remove(current);
      }
    }
    socks.stream().forEach(System.out::println);
    System.out.println(result);
  }
}
