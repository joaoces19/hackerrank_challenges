package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if(s.length()>1000){
            return;
        }

        int k = scan.nextInt();

        if(k>s.length()){
            return;
        }

        //We have a total of [totalchar - (substringsize -1)]
        String[] comb = new String[s.length()-(k-1)];
        for(int i=0; i<=s.length()-k; i++){
            comb[i] = s.substring(i, i+k);
        }

        String min = comb[0], max = comb[0];
        for(int i=1; i<comb.length; i++){
            //If 'this' string < 0, string 'this' is lower than arg
            if(comb[i].compareTo(min)<0){
                min = comb[i];
            }

            //If 'this' string > 0, string 'this' is higher than arg
            if(comb[i].compareTo(max)>0){
                max = comb[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
