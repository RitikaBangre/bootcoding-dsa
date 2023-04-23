package com.bootcoding.dsa.string;

public class StringEx6 {
    public static void main(String[]args){
     String str = ("2023-04-14");
     String [] s = str.split("-");

String year = s[0];
String month =s[1];
String day = s[2];
    System.out.println("Year= "+year);
        System.out.println("Month= "+month);
        System.out.println("Day= "+day);
    }
}
