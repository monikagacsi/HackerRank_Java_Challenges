package com.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;



public class JavaIfElse {
    public static void main(String[] args) throws IOException {
        final Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            if (N%2!=0) {
                System.out.println("Weird");
            }
            else if ((N%2==0) && (2<=N) && (N<=5)){
                System.out.println("Not Weird");
            }
            else if ((N%2==0) && (6<=N) && (N <=20)){
                System.out.println("Weird");
            }
            else if((N%2==0) && (N >20)) {
                System.out.println("Not Weird");
            }
            scanner.close();
        }
}

