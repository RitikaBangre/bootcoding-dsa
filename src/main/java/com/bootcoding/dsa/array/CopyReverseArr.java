package com.bootcoding.dsa.array;

import java.sql.SQLOutput;

//Copy elements of an array into another array in a reverse order
public class CopyReverseArr {
    public static void main(String[] args) {

        int[] input = {10, 20, 30, 40, 50};

        System.out.println("Given array");
            for (int i = 0; i < input.length; i++) {
                System.out.print(" " + input[i]);
        }

        System.out.println("\nReverse array");
        for (int i = input.length - 1; i >= 0; i--) {

            System.out.print(" " + input[i]);
        }

    }
}