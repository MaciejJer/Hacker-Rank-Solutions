package com.hackerrank.java8.introduction;

import java.util.Scanner;

public class JavaCalendarII {

  private static int[] normalYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  private static int[] leapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  private static int[] getRefYear(int year) {
    return isLeapYear(year) ? leapYear : normalYear;
  }

  private static boolean isLeapYear(int year) {
    return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
  }

  public static String getDay(String stringDay, String stringMonth, String stringYear) {
    int year = Integer.parseInt(stringYear);
    int month = Integer.parseInt(stringMonth);
    int day = Integer.parseInt(stringDay);
    int startYear = 2000;
    int startMonth = 1;
    int startDay = 1;
    int numberOfDays = 0;
    int[] refYear;
    for (int y = 2000; y <= year; y++) {
      refYear = getRefYear(y);
      for (int i : refYear) {
        for (int j = 1; j <= i; j++) {
          if (startDay == day && startMonth == month && startYear == year) {
            break;
          }
          startDay++;
          numberOfDays++;
        }
        if (startDay == day && startMonth == month && startYear == year) {
          break;
        }
        startMonth++;
        startDay = 1;
      }
      if (startDay == day && startMonth == month && startYear == year) {
        break;
      }
      startYear++;
      startMonth = 1;
      startDay = 1;
    }

    String[] days = {"SATURDAY", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"};
    return days[numberOfDays % 7];
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String month = in.next();
    String day = in.next();
    String year = in.next();

    System.out.println(getDay(day, month, year));
  }
}
