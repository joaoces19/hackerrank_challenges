package com.jc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = -4;*/
        int count = 0, it, i, j, sum;

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        scan.nextLine();
        int[] arr = new int[size];

        String numbers = scan.nextLine();
        String[] numbersArr = numbers.split(" ");
        for(i = 0; i<numbersArr.length; i++){
            arr[i] = Integer.valueOf(numbersArr[i]);
        }

        for(it = arr.length; it >= 1; it--){
            for(i=0; i<=arr.length-it; i++){
                sum = 0;
                //System.out.print("\n[");
                for(j=i; j<(it+i); j++){
                    sum = sum + arr[j];
                    //System.out.print(arr[j] + ", ");
                }
                //System.out.print("]");

                if(sum < 0){
                    count = count + 1;
                }
            }
        }

        System.out.println(count);
    }

}
