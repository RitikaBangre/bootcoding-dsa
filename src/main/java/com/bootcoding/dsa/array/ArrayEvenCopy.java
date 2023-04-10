package com.bootcoding.dsa.array;

public class ArrayEvenCopy {

    public static void main(String[] args) {
        int[] input = {1, 44, 87, 90, 61};
        int evenNumbers = 0;
        for (int i = 0; i < input.length;i++) {
            if (input[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        int[] output = new int[evenNumbers];

        int index = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                output[index++] = input[i];
            }
        }
        System.out.println("Old Array");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ",");
        }
        System.out.println("\nNew Array");
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + ",");
        }
    }

}
