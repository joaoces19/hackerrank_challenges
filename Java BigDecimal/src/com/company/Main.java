package com.company;

import java.math.BigDecimal;
import java.util.*;

class Main{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        //Write your code here

        BigDecimal b1, b2;
        String aux;
        for(int i=n-1; i>=1; i--){
            for(int j=0; j<i; j++){
                b1 = BigDecimal.valueOf(Double.valueOf(s[i]));
                b2 = BigDecimal.valueOf(Double.valueOf(s[j+1]));
                if(b1.compareTo(b2)>0){
                    aux = s[j];
                    s[j] = s[j+1];
                    s[j+1] = aux;
                }
            }
        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}