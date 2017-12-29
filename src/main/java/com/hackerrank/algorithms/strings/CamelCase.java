package com.hackerrank.algorithms.strings;

import java.util.Scanner;

public class CamelCase {

  static int camelcase(String s) {
    char[] chars = s.toCharArray();
    int result = 0;
    if (chars.length > 0) {
      result++;
      for (int i = 1; i < chars.length; i++) {
        if (chars[i] >= 65 && chars[i] <= 90) {
          result++;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    int result = camelcase(s);
    System.out.println(result);
    in.close();
  }
}
