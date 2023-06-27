package com.bootcoding.dsa.OOPS.polymorphism.overloading.calculatearea;

public class AreaCalculation {
    public double area(double radius ){
        return 3.14*radius*radius;
    }
    public double area( int length, int width){
        return length* width;
    }
}
