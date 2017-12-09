package com.hackerrank.codility;

import java.util.Scanner;

public class BinaryGap {

  public static void main(String[] args) {
    String binaryString = Integer.toBinaryString(234234353);
    char[] charArray = binaryString.toCharArray();
    int currentGap = 0;
    int maxGap = 0;
    int counter = charArray.length - 1;
    while (Character.getNumericValue(charArray[counter]) == 0) {
      counter--;
    }
    while (counter >= 0) {
      if (Character.getNumericValue(charArray[counter]) == 0) {
        currentGap++;
      } else {
        maxGap = Math.max(currentGap, maxGap);
        currentGap = 0;
      }
      counter--;
    }
    System.out.println(maxGap);
  }
}
