package com.bootcoding.dsa.leetcode;

public class UniqueValues {
    public static void main(int [] input){
        int[] nums ={1,2,3,2};
        int result= UniqueValues(nums);
        System.out.println(result);
    }
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> elements = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(elements.containsKey(nums[i])){
                elements.put(nums[i], elements.get(nums[i]) + 1);
            }else{
                elements.put(nums[i], 1);
            }
        }
        for(Integer element : elements.keySet()){
            if(elements.get(element) == 1){
                sum = sum + element;
            }
        }
        return sum;
    }
}
