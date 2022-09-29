package com.nachiket.Practice;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[]  nums = {1,3,5,6,7,9,10,11,13};
        int target = 8;
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int mid =0;
        int start = 0;
        int end = nums.length -1;
        if(target>nums[end]){
            return end+1;
        }
        if(target<nums[start]){
            return start-1;
        }
        while(start<=end){
            mid = start + (end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid -1;
            }
            else if(nums[mid]==target){
                return mid;
            }
        }
        if(nums[mid]!=target){
            mid = start;
        }

            return mid;
    }
}
