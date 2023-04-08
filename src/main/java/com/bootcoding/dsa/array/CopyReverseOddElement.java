package com.bootcoding.dsa.array;

public class CopyReverseOddElement {
    public static void main(String[] args) {
        int[] input = {10, 15, 21, 67, 50};

        System.out.println("Given array");
        for (int i = 0; i < input.length; i++) {
            System.out.print(" " + input[i]);
        }

        System.out.println("\n Reverse Odd array");
        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] % 2 == 1) {

                System.out.print(" " + input[i]);
            }

        }

    }
}