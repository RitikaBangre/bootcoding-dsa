package com.bootcoding.dsa.OOPS.encapsulation.election;

import java.util.Calendar;
import java.util.Date;

public class electionApp {
    public static void main(String[] args) {
        candiate raju = new candiate();
        raju.name = "Ganesh";
        raju.age = 30;
        raju.education = "CSE";
        raju.LOGO = "COMPUTER";
        raju.print();

        election orangecity = new election();
        orangecity.electionName = "Nagarsevak";
        orangecity.electionDate = getNextDate(15);
        orangecity.city = "Nagpur";
        System.out.println("Candiate name:- "+raju.name);
        System.out.println("Candiate logo:- " +raju.LOGO);
        System.out.println("Candiate Age:- " +raju.age);
        System.out.println("Candiate Education:- " +raju.education);
        System.out.println("Election name:- " +orangecity.getElectionName());
        System.out.println("Election date:- " +orangecity.getElectionDate());
        System.out.println("Election city:- " +orangecity.getCity());




    }
    private static Date getNextDate(int days){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, days);
        System.out.println( cal.getTime());
        return cal.getTime();
    }


}
