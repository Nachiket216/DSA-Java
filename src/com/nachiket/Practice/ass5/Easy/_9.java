package com.nachiket.Practice.ass5.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class _9 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index= {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums , index)));
    }
    public static  int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = target.length-1; j>index[i];  j--) {
                target[j]= target[j-1];
            }
                target[index[i]] = nums[i];

        }
        return target;
    }
}
