package com.nachiket.All_Concepts.Searching_algo;

public class _1LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7,8,10,11,12,15,20,23,30};
        int target = 3;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
