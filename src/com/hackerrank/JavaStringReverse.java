package com.hackerrank;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String reverse = new StringBuilder(A).reverse().toString();
            if (A.equals(reverse)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");

            }
    }
}
