package com.hackerrank.java8;

import java.util.Scanner;

public class JavaStaticInitializer {

  private static short B;
  private static short H;
  private static boolean flag = false;

  static {
    Scanner scan = new Scanner(System.in);
    B = scan.nextShort();
    H = scan.nextShort();
    if (B <= 0 || H <= 0) {
      System.out.println("java.lang.Exception: Breadth and height must be positive");
    } else {
      flag = true;
    }
  }

  public static void main(String[] args) {
    if (flag) {
      int area = B * H;
      System.out.print(area);
    }
  }//end of main
}//end of class


