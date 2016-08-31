package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s = s.trim();
        if(s.length()>=1 && s.length()<=4*Math.pow(10, 5) && s.matches("[A-Za-z !,?._'@]+")){
            String[] sArr = s.split("[ !,?._'@]+");
            System.out.println(sArr.length);
            for(int i=0; i<sArr.length; i++){
                System.out.println(sArr[i]);
            }
        }
    }
}
