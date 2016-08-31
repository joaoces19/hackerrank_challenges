package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int i, j;
        for(i=0; i < 6; i++){
            for(j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int max=Integer.MIN_VALUE, sumHourGlass;
        for(i=0; i < 4; i++){
            for(j=0; j < 4; j++){
                sumHourGlass =
                        arr[i][j] + arr[i][j+1] + arr[i][j+2]
                                    + arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                if(sumHourGlass > max){
                    max = sumHourGlass;
                }
            }
        }

        System.out.println(max);
    }
}
