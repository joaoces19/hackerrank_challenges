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
        int N = scan.nextInt();
        scan.nextLine();
        String[] arr = new String[N];
        String s1;
        int i, j;
        for(i=0; i<N; i++){
            arr[i] = scan.nextLine();
        }

        for(i=0; i<N; i++){
            s1 = "";
            for(j=0; j<arr[i].length(); j++){
                if((j%2)==0){
                    System.out.print(arr[i].charAt(j));
                } else{
                    s1 = s1.concat(arr[i].charAt(j) + "");
                }
            }
            System.out.print(" " + s1 + "\n");
        }
    }
}