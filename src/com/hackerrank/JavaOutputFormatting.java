package com.hackerrank;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String text = sc.next();
            int num = sc.nextInt();
            System.out.printf("%-15s%03d%n", text, num);
        }
        System.out.println("================================");
        sc.close();
    }
}