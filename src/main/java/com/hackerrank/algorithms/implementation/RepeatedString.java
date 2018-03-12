package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class RepeatedString {

  static long repeatedString(String s, long n) {
    long counter = 0L;

    for (int i =0; i< s.length(); i++){
      if ('a'==(s.charAt(i))){
        counter++;
      }
    }
    counter = counter * (n/ s.length());
    long reminder = n% s.length();
    for (int i =0; i< reminder; i++){
      if ('a'==(s.charAt(i))){
        counter++;
      }
    }
    return counter;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    long n = in.nextLong();
    long result = repeatedString(s, n);
    System.out.println(result);
    in.close();
  }
}

