package com.hackerrank.algorithms.graphTheory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JourneyToTheMoon {

  public static void main(String[] args) throws Exception {
    BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\pit\\Downloads\\input11JourneyMoon.txt")));
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

    for (int i = 0; i < N; i++) {
      if (astronauts.add(i)) {
        countries.put((countries.size() + 1),
            Stream.of(i).collect(Collectors.toCollection(HashSet::new)));
      }
    }

    List<Integer> sizes = new ArrayList<>();
    for (Map.Entry<Integer, Set<Integer>> entry : countries.entrySet()) {
      sizes.add(entry.getValue().size());
    }

    int size = sizes.size();
    long combinations = 0;
    if (size > 1) {
      for (int i = 0; i < size - 1; i++) {
        for (int j = i + 1; j < size; j++) {
          if (i < size) {
            combinations = combinations + sizes.get(i) * sizes.get(j);
          }
        }
      }
    }
    System.out.println(combinations);
  }
}


