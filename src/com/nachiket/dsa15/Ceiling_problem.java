package com.nachiket.dsa15;

public class Ceiling_problem {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 18;
        System.out.println(BinarySearch(arr,target));
     }
    static int BinarySearch(int[] arr, int target){
        if (target > arr[arr.length -1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start<=end){
            mid = start+(end-start)/2;
            if(arr[mid]<target){
                start = mid+1;
            }

            if(arr[mid]>target){
                end = mid-1;
            }
            if(arr[mid]==target){
                return mid;
            }

        }
        return arr[start];
    }
}
