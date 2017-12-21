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
        new FileInputStream("C:\\Users\\pit\\Downloads\\input08JourneyMoon.txt")));
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
        for (Map.Entry<Integer, Set<Integer>> entry : countries.entrySet()) {
          if (entry.getValue().contains(a) || entry.getValue().contains(b)) {
            entry.getValue().add(a);
            entry.getValue().add(b);
            break;
          }
        }
      } else {
        countries.put(i, Stream.of(a, b).collect(Collectors.toCollection(HashSet::new)));
      }
    }

    long total = N * (N - 1L) / 2L;
    for (Map.Entry<Integer, Set<Integer>> entry : countries.entrySet()) {
      total = total - entry.getValue().size() * (entry.getValue().size() - 1) / 2;
    }
    System.out.println(total);

    long combinations = 0;
    System.out.println(combinations);
  }
}
