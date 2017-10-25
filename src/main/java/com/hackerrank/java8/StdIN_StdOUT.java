package com.hackerrank.java8;

import java.util.*;

public class StdIN_StdOUT {

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = 1;
    while (stdIn.hasNextLine()) {
      String line = stdIn.nextLine();
      System.out.println(n + " " + line);
      n++;
    }
  }
}
