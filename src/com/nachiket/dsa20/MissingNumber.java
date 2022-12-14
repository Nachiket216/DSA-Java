package com.nachiket.dsa20;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,5,6,4,0,1,2,7,9,11,12,10};
        System.out.println(sort(arr));
        System.out.println(Arrays.toString(arr));
    }
    static int sort(int[] arr){
        int i = 0 ;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i] <arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =temp;
    }
}
