package com.hackerrank;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int k = 1;
            for (int j = 0; j < n; j++) {
                a = a + k * b;
                System.out.print(a + " ");
                k = k * 2;
            }
            System.out.println();
        }
        sc.close();
    }
}