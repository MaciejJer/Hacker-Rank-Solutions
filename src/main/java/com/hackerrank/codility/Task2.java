package com.hackerrank.codility;

public class Task2 {

  public static void main(String[] args) {
    int T[] = {-3, -14, -5, 7, 8,42,8,3};
    int separator = T.length/4;
    int index = 0;
    int wi = 0;
    int sp = 0;
    int su = 0;
    int au = 0;
    while (index < T.length) {
      int tempMax = Integer.MIN_VALUE;
      int tempMin = Integer.MAX_VALUE;
      while (index < separator){
        tempMax = Math.max(T[index], tempMax);
        tempMin = Math.min(T[index], tempMin);
        wi = tempMax - tempMin;
        index ++;
      }
      separator = separator+ T.length/4;
      tempMax = Integer.MIN_VALUE;
      tempMin = Integer.MAX_VALUE;
      while (index < separator){
        tempMax = Math.max(T[index], tempMax);
        tempMin = Math.min(T[index], tempMin);
        sp = tempMax - tempMin;
        index ++;
      }
      separator = separator+ T.length/4;
      tempMax = Integer.MIN_VALUE;
      tempMin = Integer.MAX_VALUE;
      while (index < separator){
        tempMax = Math.max(T[index], tempMax);
        tempMin = Math.min(T[index], tempMin);
        su = tempMax - tempMin;
        index ++;
      }
      separator = separator+ T.length/4;
      tempMax = Integer.MIN_VALUE;
      tempMin = Integer.MAX_VALUE;
      while (index < separator){
        tempMax = Math.max(T[index], tempMax);
        tempMin = Math.min(T[index], tempMin);
        au = tempMax - tempMin;
        index ++;
      }
      separator = separator + T.length/4;
    }
    String reply = "REPLY";
    if(wi > sp && wi > su && wi > au) reply = "WINTER";
    if(sp > wi && sp > su && sp > au) reply = "SPRING";
    if(su > sp && su > su && su > au) reply = "SUMMER";
    if(au > sp && au > su && au > au) reply = "AUTUMN";
    System.out.println(reply);
  }
}
