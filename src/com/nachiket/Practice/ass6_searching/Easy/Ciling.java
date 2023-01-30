package com.nachiket.Practice.ass6_searching.Easy;

public class Ciling {
    public static void main(String[] args) {
        int[] arr= {2,3,5,9,14,16,18};
        int target = 6;
        System.out.println(solve(arr,target));
    }
    static int solve(int[] arr, int  target){
        int start = 0, end = arr.length;
        int  mid=0;
        if(target>arr.length-1){
            return -1;
        }
        while(start<=end){
            mid = start+(end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }

        return start;
    }
}
