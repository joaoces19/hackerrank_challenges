package com.company;

import java.util.*;

public class Main {

    private final static String INSERT = "Insert";
    private final static String DELETE = "Delete";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            arr.add(scan.nextInt());
        }

        int q = scan.nextInt();

        int x, y;
        for(int i=0; i<q; i++){
            scan.nextLine();
            String op = scan.nextLine();

            if(op.equals(INSERT)){
                x = scan.nextInt();
                y = scan.nextInt();
                arr.add(x, y);
            } else if(op.equals(DELETE)){
                x = scan.nextInt();

                arr.remove(x);
            } else {
                return;
            }
        }

        for(Integer print : arr){
            System.out.print(print + " ");
        }

    }
}
