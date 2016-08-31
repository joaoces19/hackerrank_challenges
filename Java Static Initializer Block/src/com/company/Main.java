package com.company;

import java.util.Scanner;

public class Main {
    public static boolean flag = readInput();

    public static int B;
    public static int H;

    public static boolean readInput(){
        try {
            Scanner scan = new Scanner(System.in);
            H = scan.nextInt();
            if (H <= 0) {
                throw new Exception();
            }

            B = scan.nextInt();
            if (B <= 0) {
                throw new Exception();
            }
            return true;
        } catch (Exception e){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            return false;
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main


}//end of class
