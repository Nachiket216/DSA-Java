package com.nachiket.dsa15;

public class BitonicArray {
    public static void main(String[] args){
        int[] arr={0,2,9,10,1000,10980,146,123,35,23,1,0};
        System.out.println(arr.length);
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
                int start= 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }else if(arr[mid]>arr[end]){
                end= mid;
            }
        }
        return start;
    }
    /*static int ans(int[] arr){
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[j]){
              return i;
            }
            j++;
        }
        return -1;
    }*/
}
