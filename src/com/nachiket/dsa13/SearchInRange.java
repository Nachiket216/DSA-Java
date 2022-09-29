package com.nachiket.dsa13;

public class SearchInRange {
    public static void main(String[] args) {
    int [] arr = {18,12,-7,3,14,28};

        System.out.println(fun(arr,1,4,18));
    }
    static int fun(int []arr,int start,int end, int search){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if(arr[i]==search){
                return i;
            }
        }

        return -1;
    }

}
