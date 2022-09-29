package com.nachiket.dsa15;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'f';
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(char[] arr, char target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
                start= mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return arr[start % arr.length];
    }
}
