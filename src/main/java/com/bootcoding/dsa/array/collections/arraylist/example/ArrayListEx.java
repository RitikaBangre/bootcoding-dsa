package com.bootcoding.dsa.array.collections.arraylist.example;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[]args){
        int [] element = new int[2];
        element [0]=10;
        element [1]=20;

        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add("hello");

        ArrayList<Integer> intdata = new ArrayList<>();
        intdata.add(10);
        intdata.add(20);
        //intdata.add("hello");// compile time error found :- incompatible types: java.lang.String cannot be converted to java.lang.Integer

        for(int i=0;i< intdata.size();i++){
            System.out.println(intdata.get(i));
        }
    }
}
