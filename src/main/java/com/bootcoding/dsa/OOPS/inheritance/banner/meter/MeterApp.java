package com.bootcoding.dsa.OOPS.inheritance.banner.meter;

public class MeterApp {
    public static void main(String[] args) {
        SinglePhaseMeter SM = new SinglePhaseMeter();
        SM.type = "Single phase";
        SM.Analog = "Digital Meter";
        SM.Reading = "1000";
        SM.voltage = 230;
        SM.create();
        SM.display();
    }
}
