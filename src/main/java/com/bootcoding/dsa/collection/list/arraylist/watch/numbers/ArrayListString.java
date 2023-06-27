package com.bootcoding.dsa.collection.list.arraylist.watch.numbers;

import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[]args){

        ArrayList<String> alstr = new ArrayList <>();


        alstr.add("hp");
        alstr.add("windows");
        alstr.add("acer");
        alstr.add("Dell");
        alstr.add("Asus");
        alstr.add("Apple");

        for(int i =0 ;i< alstr.size();i++){
            System.out.println("Laptop name =" + alstr.get(i));

        }

    }
}
