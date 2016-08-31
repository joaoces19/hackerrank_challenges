package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println(factorial(n));
    }

    private static int factorial(int n){
        if(n>0){
            return n * factorial(n-1);
        }
        return 1;
    }
}
