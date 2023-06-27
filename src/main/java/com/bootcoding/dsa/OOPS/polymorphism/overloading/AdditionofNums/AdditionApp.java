package com.bootcoding.dsa.OOPS.polymorphism.overloading.AdditionofNums;

public class AdditionApp {
    public static void main (String[]args){
        AdditionOfNumbers aon = new AdditionOfNumbers();
        System.out.println("Addition of two numbers is "+aon.add(2,3));
        System.out.println("Addition of two numbers is"+aon.add(3.5,1.5));
        System.out.println("Addition of two numbers is"+aon.add(2,5,2));
    }
}
