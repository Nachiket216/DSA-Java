package com.nachiket.dsa20;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[]arr={1,2,2,4};
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
                ar[k]= arr[index];
                k++;
                ar[k]=index+1;
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
