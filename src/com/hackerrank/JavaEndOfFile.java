package com.hackerrank;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNext()) {
            String text = sc.next();
            System.out.println(i + " " + text);
            i++;
        }
    }
}
