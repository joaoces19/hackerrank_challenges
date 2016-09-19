package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joaoces on 11-09-2016.
 */
public class Calculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        int sum = n;
        for(int i=1; i<n; i++){
            if((n%i)==0){
                sum = sum + i;
            }
        }

        return sum;
    }
}
