package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        try {
            if(Integer.valueOf(year) <= 2000 || Integer.valueOf(year) >= 3000){
                return;
            }

            Date d = new SimpleDateFormat("MM dd yyyy").parse(month + " " + day + " " + year);
            Calendar c = Calendar.getInstance();

            c.setTime(d);

            System.out.println(c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()).toUpperCase());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
