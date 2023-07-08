package com.bootcoding.dsa.recursion;

public class DigitCount {
    public static void main(String[] args) {
        countofdigit(1234);
        int result = countofdigit(1234);
        System.out.println(result);
    }
    public static int countofdigit(int num){
        if(num == 0){
            return 0;
        }

         return 1+countofdigit(num/10);
    }
}
