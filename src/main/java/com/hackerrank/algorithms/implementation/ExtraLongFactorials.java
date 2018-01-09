package com.hackerrank.algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ExtraLongFactorials {

  static void extraLongFactorials(int n) {
    BigInteger result = new BigInteger("1");
    for (int i = 1; i <=n; i++){
      result = result.multiply(new BigInteger(Integer.toString(i)));
    }
    System.out.println(result);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    extraLongFactorials(n);
    in.close();
  }
}
