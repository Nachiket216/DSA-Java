package com.nachiket.Practice.ass5.Easy;

import java.util.Arrays;

public class _5 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int j=0;

        for(int i=0; i<n; i++){
            arr[j] = nums[i];
            arr[j+1] = nums[n+i];
            j+=2;
        }


        return arr;
    }
}
