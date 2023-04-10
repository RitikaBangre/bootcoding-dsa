package com.bootcoding.dsa.leetcode;

public class FindNumbersandEvenNumbers {
    public static int findNumbers(int[] nums) {
    int n =nums.length;
    int count=0;
    for(int i=0;i<n;i++){

        int digit = 0;
        while(nums[i]!=0){
            nums[i]=nums[i]/10;
            digit++;;
        }
        if(digit%2==0){
            count++;
        }
    }
    return count;

}

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int result = findNumbers(nums);
        System.out.println(result);

    }
}
