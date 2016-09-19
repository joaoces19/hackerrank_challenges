package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
    private int token;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getToken() {
        return token;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());
        PriorityQueue<Student> pQStudent = new PriorityQueue<>(totalEvents, new Comparator<Student>() {
            @Override
            public int compare(Student o2, Student o1) {
                if(Double.compare(o1.getCgpa(), o2.getCgpa())==0){
                    if(o1.getFname().compareTo(o2.getFname())==0){
                        return Integer.compare(o1.getToken(), o2.getToken());
                    } else {
                        return o2.getFname().compareTo(o1.getFname());
                    }
                } else{
                    return Double.compare(o1.getCgpa(), o2.getCgpa());
                }
            }
        });
        while(totalEvents>0){
            String event = in.nextLine();

            //Complete your code
            String[] input = event.split(" ");
            switch (input[0]){
                case "ENTER": pQStudent.add(new Student(Integer.valueOf(input[3]), input[1], Double.valueOf(input[2])));
                    break;
                case "SERVED": pQStudent.poll();
                    break;
            }
            Object o = new Student();
            o.in;
            totalEvents--;
        }

        if(pQStudent.size() == 0){
            System.out.println("EMPTY");
        } else {
            while (pQStudent.size() != 0) {
                Student s = pQStudent.poll();
                System.out.println(s.getFname());
            }
        }
    }
}