package com.nachiket.Practice.ass5.Easy;

public class _7 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
    public static  int numIdenticalPairs(int[] nums) {
    int length = nums.length;
    int counter=0;
    for(int i=0; i<length; i++){
        for(int j=i+1; j<length; j++){
            if(nums[i]==nums[j]){
                counter++;
            }
        }
    }
        return counter;
    }
}
