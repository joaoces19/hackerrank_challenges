package com.jc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        String s = Integer.toBinaryString(n);

        int max = 0, count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                count = count + 1;
            } else{
                if(count>max){
                    max = count;
                }
                count = 0;
            }
        }

        System.out.print(max > count ? max : count);
    }
}
