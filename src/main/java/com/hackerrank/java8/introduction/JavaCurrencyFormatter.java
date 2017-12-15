package com.hackerrank.java8.introduction;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    String us = "$" + String.format( "%,.2f", payment);
    String india = "Rs." + String.format( "%,.2f", payment);
    String china = "¥" + String.format( "%,.2f", payment);
    NumberFormat numberFormatter = NumberFormat.getNumberInstance(new Locale("FRENCH","FRANCE"));
    String france = numberFormatter.format(payment) + " €";


/*    DecimalFormat decimalFormat = new DecimalFormat("#%1$t##0.00");
    String france = decimalFormat.format(payment) + " EUR";*/
    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
  }
}
