package com.hackerrank.java8.introduction;


import java.util.Calendar;
import java.util.Scanner;

public class JavaDateTime {

  public static String getDay(String day, String month, String year) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(Integer.parseInt(year), (Integer.parseInt(month) - 1), Integer.parseInt(day));
    int i = calendar.get(Calendar.DAY_OF_WEEK);
    String[] daysOfWeek = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday"};
    return daysOfWeek[i - 1];
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String month = in.next();
    String day = in.next();
    String year = in.next();
    System.out.println(getDay(day, month, year));
  }
}

