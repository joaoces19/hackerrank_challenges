package com.company;

/**
 * Created by joaoces on 06-09-2016.
 */
public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements){
        this.elements = elements;
    }

    // Add your code here

    public void computeDifference(){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<elements.length; i++){
            if(min > elements[i]){
                min = elements[i];
            }

            if(max < elements[i]){
                max = elements[i];
            }
        }

        maximumDifference = Math.abs(Math.abs(max) - Math.abs(min));
    }
}
