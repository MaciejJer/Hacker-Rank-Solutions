package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class GradingStudents {

    static int[] solve(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            if (grade >= 38) {
                if (grade % 10 == 3 || grade % 10 == 4) {
                    grade = grade - grade % 10 + 5;
                }
                if (8 == grade % 10 || grade % 10 == 9) {
                    grade = grade - grade % 10 + 10;
                }
            }
            grades[i]= grade;
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
