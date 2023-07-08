package com.bootcoding.dsa.recursion;

public class EvenDecending {
    public static void main(String[] args) {
         EvenNumbsDecending(10);
    }

    public static int EvenNumbsDecending(int n) {
        int Evennumber;
        if(n==0){
            return 0;
        }
        if (n % 2 == 0) {
            System.out.println(n);
        }

        return n + EvenNumbsDecending(n-1);
    }
}
