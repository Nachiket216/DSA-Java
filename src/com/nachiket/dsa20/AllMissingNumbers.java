package com.nachiket.dsa20;

import java.util.Arrays;

public class AllMissingNumbers {
    public static void  main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        int i = 0 ;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        int[] ar = new int[10];
        int k = 0;
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
                ar[k]= index+1;
                k++;
            }
        }
        return ar;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =temp;
    }
}
