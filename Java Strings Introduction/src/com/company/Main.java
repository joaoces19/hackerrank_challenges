package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int res = A.length() + B.length();
        System.out.println(res);
        System.out.println(A.compareTo(B) > 0 ? "Yes":"No");
        System.out.println(Character.toUpperCase(A.charAt(0)) +  A.substring(1) + " " + Character.toUpperCase(B.charAt(0)) +  B.substring(1) );
    }
}
