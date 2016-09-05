package com.company;

import java.util.List;

/**
 * Created by joaoces on 05-09-2016.
 */
public class Student extends Person{
    private int[] scores;

    public Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.scores = scores;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public String calculate(){
        int sum = 0;
        for(int i=0; i<scores.length; i++){
            sum = sum +scores[i];
        }

        double result = sum/scores.length;

        if(result < 40){
            return "T";
        } else if(result >= 40 && result < 55){
            return "D";
        } else if(result >= 55 && result < 70){
            return "P";
        } else if(result >= 70 && result < 80){
            return "A";
        } else if(result >= 80 && result < 90){
            return "E";
        } else if(result >= 90 && result <= 100){
            return "O";
        }

        return "INVALID SCORE";
    }
}
