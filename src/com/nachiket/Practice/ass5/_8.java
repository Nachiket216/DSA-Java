package com.nachiket.Practice.ass5;

import java.util.Arrays;

public class _8 {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            int counter = 0;
            for(int j=0; j<length; j++){
                if(nums[i]>nums[j]){
                   counter++;
                }
            }
            arr[i]=counter;
        }
        return arr;
    }
}
