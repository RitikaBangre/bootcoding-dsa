package com.bootcoding.dsa.string;

import jdk.jfr.Percentage;

//Consider student results is published in following format
//Marks1,Marks2,Marks3
//For Example: "72,65,77"
//Calculate its average and percentage and append it to input string and print in following format
//72,65,77,XX,XX
public class StringEx7Assignment {
    public static void main(String[] args) {
        String str [] = { "72", "65", "77" };
//        String[] s = str.split(" ");
        int Marks1 = Integer.parseInt(str[0]);
        int Marks2 = Integer.parseInt(str[1]);
        int Marks3 = Integer.parseInt(str[2]);

//        int Average = Integer.parseInt(str[str.length]);

        int Sum = Marks1 + Marks2 + Marks3;
        int Average = Sum / 3;
        System.out.println("Average is " + Average);
        double Percentage = Marks1 + Marks2 + Marks3 / 300 * 100;
        System.out.println("Percentage is =" + Percentage);
    }
}

