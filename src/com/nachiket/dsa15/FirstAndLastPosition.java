package com.nachiket.dsa15;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[]arr= {5,7,7,7,7,7,7,8,8,10};
        int target=7;
        System.out.println(Arrays.toString(first(arr, target)));

    }
    static int[] first(int[] arr,int target){
        int[] ans={-1,-1};
        ans[0]=check(arr,target,true);
        ans[1]=check(arr,target,false);
        return ans;

    }
    static int check(int[] arr, int target, boolean findStartIndex){
        int ans = -1;
        int start = 1;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
                start = mid+1;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end=mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
