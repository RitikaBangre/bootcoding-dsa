package com.bootcoding.dsa.leetcode;

public class FindValueAfterOperations {
    public static void main(int[]args){
        int result=0;
        int AfterOperationsValue = result ;
        System.out.println(result);
    }
    public int finalValueAfterOperations(String[] operations) {
    int X=0;
    for(int i=0;i<operations.length;i++){
        if (operations[i].equals("X++")){
            X = X+1;
        }else if (operations[i].equals("++X")){
            X = X+1;
        }
        else if (operations[i].equals("X--")){
            X = X-1;
        }else if (operations[i].equals("--X")){
            X = X-1;
        }

    } return X;
}
}
