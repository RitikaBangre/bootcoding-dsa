package com.bootcoding.dsa.OOPS.inheritance.banner;

public class Banner {
    String material;
    String color;
    String shape;
    String matter;
    double size = 0.0;
    double price=0.0;
    String type;

   public void  create(){
       System.out.println("Banner has been created");

    }
    public void display(){
        System.out.println("Banner is printed");

    }
    Banner(){
        System.out.println("Banner has been created");
    }
}
