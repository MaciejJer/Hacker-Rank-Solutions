package com.hackerrank.java8.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
    String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
    String china = NumberFormat.getCurrencyInstance(Locale.SIMPLIFIED_CHINESE).format(payment);
    String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);

/*  String france = String.format( "%,.2f", payment) + " €";
    france = france.replaceAll(","," ");
    france = france.replaceAll("\\.",",");*/

    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
  }
}
