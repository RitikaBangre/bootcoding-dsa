package com.bootcoding.dsa.array;

public class CopyEvenIndex {
    public static void main(String[]args){
        int[] input ={10,40,20,60,80,75};
        int index=0;
        System.out.println("Even index element of array");
        for(int i=0;i<input.length;i++){
            if (input[i]%2==0){
               System.out.println ( input [i]);
            }
        }
    }
}
