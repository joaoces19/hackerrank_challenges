package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        Pattern p = Pattern.compile("<(.+)>([^<>]+)<\\/\\1>");
        Matcher matcher;
        boolean notFound;
        while(testCases>0){
            String line = in.nextLine();

            matcher = p.matcher(line);

            notFound = true;
            while(matcher.find()){
                //0 1 2 3 4 5
                //i*3+2
                if(!matcher.group(2).isEmpty()){
                    System.out.println(matcher.group(2));
                    notFound = false;
                }
            }

            if(notFound){
                System.out.println("None");
            }

            testCases--;
        }
    }
}
