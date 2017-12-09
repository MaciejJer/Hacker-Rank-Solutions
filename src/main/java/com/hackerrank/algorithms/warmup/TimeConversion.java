package com.hackerrank.algorithms.warmup;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeConversion {

  private static String timeConversion(String s) {
    String result = "fail";
    int hour;
    Pattern morning = Pattern.compile("^([01]?\\d:[0-5]\\d:[0-5]\\dAM)$");
    Pattern evening = Pattern.compile("^([01]?\\d:[0-5]\\d:[0-5]\\dPM)$");
    Matcher matcher = morning.matcher(s);
    if (matcher.find()) {
      result = s.replaceAll("AM", "");
      hour = Integer.valueOf(s.substring(0, 2));
      if (hour == 12) {
        String temp = result;
        result = temp.substring(0, 2).replace("12", "00").concat(result.substring(2));
      }
      return result;
    }
    matcher = evening.matcher(s);
    if (matcher.find()) {
      result = s.replaceAll("PM", "");
      hour = Integer.valueOf(s.substring(0, 2));
      if (hour < 12) {
        result = Integer.toString(hour + 12).concat(result.substring(2));
      }
      return result;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    String result = timeConversion(s);
    System.out.println(result);
  }
}
