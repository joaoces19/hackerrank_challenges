package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        //if par
        // 6/2 + 0 = 3
        // 3
        // 0 1 2  3 4 5
        //if impar
        // 5/2 + 1 = 3
        // 0 1 | 2 | 3 4
        for(int i=0; i<(A.length()/2) + A.length()%1; i++){
            if(!(A.charAt(i) == A.charAt(A.length()-i-1))){
                System.out.print("No");
                return;
            }
        }

        System.out.print("Yes");
    }
}
