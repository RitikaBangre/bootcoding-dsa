package com.bootcoding.dsa.leetcode;

public class MovesZeros {

    public static void MoveZeroes(int[] input) {
    int [] nums={0,1,0,3,12};
        int current=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[current++]= nums[i];
            }
        }
        while(current<nums.length){
            nums[current++]=0;
        }
    }
}
