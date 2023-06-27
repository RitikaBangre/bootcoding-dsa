package com.bootcoding.dsa.OOPS.polymorphism.overloading.calculatearea;

public class AreaApp {
    public static void main(String[] args) {

        AreaCalculation ac = new AreaCalculation();
        System.out.println(ac.area(2.5));
        System.out.println(ac.area(5,4));

    }
}