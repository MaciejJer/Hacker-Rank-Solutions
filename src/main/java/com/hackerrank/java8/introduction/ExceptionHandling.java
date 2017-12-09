package com.hackerrank.java8.introduction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

  private static int x;
  private static int y;

  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      x = sc.nextInt();
      y = sc.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("java.util.InputMismatchException");
      System.exit(0);
    }
    try {
      System.out.println(x / y);
    } catch (ArithmeticException e) {
      System.out.println(e.toString());
    }
  }
}
