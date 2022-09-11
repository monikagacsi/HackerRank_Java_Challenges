package com.hackerrank;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static boolean instance = initializeInstanceVariable();

    static boolean initializeInstanceVariable() {
        boolean instance = false;

        if (B > 0 && B < 100 && H > 0 && H < 100) {
            instance = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            instance = false;
        }
        return instance;
    }


    public static void main(String[] args) {
        if (instance) {
            int area = B * H;
            System.out.print(area);
        }
    }



        

}
