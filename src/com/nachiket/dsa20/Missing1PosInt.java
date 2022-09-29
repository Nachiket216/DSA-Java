package com.nachiket.dsa20;

import java.util.Arrays;

public class Missing1PosInt {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(sort(arr));
        System.out.println(Arrays.toString(arr));
    }
    static int sort(int[] arr){
        int i = 0 ;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i]>0&&arr[i] <=arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =temp;
    }
}
