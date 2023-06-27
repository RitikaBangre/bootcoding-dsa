package com.bootcoding.dsa.collection.list.arraylist.watch;

import com.bootcoding.dsa.typecasting.watch.Watch;

import java.util.ArrayList;

public class ArraylistWatchApp {
    public static void main(String[]args){

        ArrayList <String> watches = new ArrayList< >();
         watches.add("w1");
         watches.add("w2");
        for(int i=0;i<10;i++) {
            watches.add("w1");
            System.out.println("FirstElement = " +watches.get(i));

        }

    }
}
