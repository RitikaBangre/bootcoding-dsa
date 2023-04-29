package com.bootcoding.dsa.OOPS.inheritance.banner;

public class Bannerapp {
    public static void main(String[] args) {
        FlexBanner fb = new FlexBanner();
        fb.color = "Blue";
        fb.material = "Plastic";
        fb.matter ="New Batches of java is starting soon";
        fb.price = 1500.0;
        fb.shape ="Rectangle";
        fb.size = 15*20;
        fb.type ="flex";
        fb.create();
        fb.display();
    }
}
