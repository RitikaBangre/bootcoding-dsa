package com.bootcoding.dsa.recursion;

public class OddNumbers {
    public static void main(String[] args) {

        oddnumbers(10);
    }
    public static void oddnumbers(int n) {
        System.out.println("Oddnumbers in ascending order");
        if (n == 0) {
            return;
        }
        oddnumbers(n - 1);
        if (n % 2 != 0) {
            System.out.println(n);
        }
    }
}