package com.bootcoding.dsa.leetcode;

public class RunningSum {
    public static void main(String[]args){
        int[]array={1, 3, 4, 6, 9, 23};
        int[] result = runningSum(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
    public static int[] runningSum(int[] nums){
        int n=nums.length;
        for(int i=1;i<n;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}
