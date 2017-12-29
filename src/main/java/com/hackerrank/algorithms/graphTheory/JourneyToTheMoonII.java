package com.hackerrank.algorithms.graphTheory;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JourneyToTheMoonII {

  public static void main(String[] args) throws Exception {
    BufferedReader bfr = new BufferedReader(new InputStreamReader(
        new FileInputStream("C:\\Users\\pit\\Downloads\\input01JourneyMoon.txt")));
    String[] temp = bfr.readLine().split(" ");
    int N = Integer.parseInt(temp[0]);
    int I = Integer.parseInt(temp[1]);

    Set<Integer> astronauts = new HashSet<>();
    HashMap<Integer, Set<Integer>> countries = new HashMap<>();

    for (int i = 0; i < I; i++) {
      temp = bfr.readLine().split(" ");
      int a = Integer.parseInt(temp[0]);
      int b = Integer.parseInt(temp[1]);
      boolean checkUpA = astronauts.add(a);
      boolean checkUpB = astronauts.add(b);
      if (!(checkUpA && checkUpB)) {
        if (!checkUpA && !checkUpB) {
          int key1 = -1;
          int key2 = -1;
          for (Map.Entry<Integer, Set<Integer>> entry : countries.entrySet()) {
            if (entry.getValue().contains(a)) {
              key1 = entry.getKey();
            }
            if (entry.getValue().contains(b)) {
              key2 = entry.getKey();
            }
          }
          //merge countries
          if (key1 != key2 && countries.size() > 1) {
            countries.get(key1).addAll(countries.remove(key2));
          }

        } else { //add to the same country
          for (Map.Entry<Integer, Set<Integer>> entry : countries.entrySet()) {
            if (entry.getValue().contains(a) || entry.getValue().contains(b)) {
              entry.getValue().add(a);
              entry.getValue().add(b);
              break;
            }
          }
        }
      } else { //create and add new country
        countries.put(i, Stream.of(a, b).collect(Collectors.toCollection(HashSet::new)));
      }
    }
    long combinations = 0;
    combinations = N * (N - 1L) / 2L;
    if (countries.size() > 0) {
      for (Map.Entry<Integer, Set<Integer>> entry : countries.entrySet()) {
        combinations = combinations - entry.getValue().size() * (entry.getValue().size() - 1) / 2;
      }
    }
    System.out.println(combinations);
  }
}
