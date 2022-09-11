package com.hackerrank;

import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String s = "";
            if (n <= 100 && n >= -100) {
                s.valueOf(n);
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }
            sc.close();

        }

}
