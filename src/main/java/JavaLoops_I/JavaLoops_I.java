package JavaLoops_I;

import java.io.*;
import java.util.*;

public class JavaLoops_I {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= 10; i++){ //
            System.out.println(N + " x " + i + " = " + (i*N));
        }
    }
}