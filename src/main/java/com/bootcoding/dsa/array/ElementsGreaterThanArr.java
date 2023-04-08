package com.bootcoding.dsa.array;

import java.sql.SQLOutput;

//Write a program to find the number of elements in an array that are greater than the average.
public class ElementsGreaterThanArr {
    public static void main(String[] args) {

        int[] input = {10, 20, 30, 40, 50};
        int n = input.length;
        double sum = 0;
        double avg = 0;
        int i = 0;
        for (i = 0; i < input.length; i++) {
            System.out.print(" " + input[i]);
        }

        for (i = 0; i < input.length; i++) {
            sum = sum + input[i];
        }
        avg = sum / input.length;
        System.out.println("\n Average of array" + avg);
        for (i = 0; i < input.length; i++) {
            if (input[i] > avg) {
                System.out.print(" " + input[i]);
            }
        }
    }
}
