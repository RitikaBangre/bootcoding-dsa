package com.bootcoding.dsa.recursion;

import org.w3c.dom.ls.LSOutput;

public class SumOfNumbers {
    public static void main(String[] args){
        sumOfNumbers(10);
    }
    public static int sumOfNumbers(int n){
        int sum=0;
        if(n == 0){
            return 0;
        }
         sum = n + sumOfNumbers(n-1);
        System.out.println(+sum);
        return sum;
    }


}
