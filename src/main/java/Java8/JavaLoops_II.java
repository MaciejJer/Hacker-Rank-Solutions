package Java8;
import java.util.*;
import java.io.*;

class JavaLoops_II {
    public static void main(String[] argh) { //Calculating of the elements in the loop
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) { // here we calculate the following elements of the line
                int element = a;
                for (int m = 0; m <= j; m++) {
                    element = (element + ((int) Math.pow(2, m) * b));
                }
                System.out.print(element + " ");
            }
            System.out.println();
        }
        in.close();

    }
}