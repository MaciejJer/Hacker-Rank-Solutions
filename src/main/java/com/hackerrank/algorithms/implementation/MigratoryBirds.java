package com.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MigratoryBirds {

  private static int migratoryBirds(int[] ar) {
    List<Integer> typesQuantity = new ArrayList<>();
    IntStream.range(1, 6).forEach(i -> {
      typesQuantity.add(((int) Arrays
          .stream(ar)
          .filter(num -> num == i)
          .count()));
    });
    return typesQuantity.indexOf(typesQuantity
        .stream()
        .max(Comparator.naturalOrder())
        .orElse(null)) + 1;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] ar = new int[n];
    for (int ar_i = 0; ar_i < n; ar_i++) {
      ar[ar_i] = in.nextInt();
    }
    int result = migratoryBirds(ar);
    System.out.println(result);
  }
}
