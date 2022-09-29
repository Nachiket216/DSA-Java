package com.nachiket.dsa14;

public class OrderAgnosticBinarySearch {
    public static void main(String[]args){
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 18;
//        int[] arr = {89,45,22,18,16,15,4,3,2,0,-4,-12,-18};

        System.out.println(orderAgnosticBS(arr,target));
    }
    static int orderAgnosticBS(int arr[],int target){
        int start = 0;
        int end = arr.length - 1;
        boolean type = arr[start] < arr[end];

        while(start<=end){
            int mid = start+(end- start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(type){
                if(arr[mid]<target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(arr[mid]<target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }

        return -1;
    }
}

