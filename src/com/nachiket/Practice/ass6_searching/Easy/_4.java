package com.nachiket.Practice.ass6_searching.Easy;
import java.util.Arrays;

public class _4 {
    public static void main(String[] args) {
        int[] arr = {2,7 ,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int start =0, end = numbers.length-1;
        while(start<end){
            if(numbers[start]+numbers[end]==target){
                arr[0]=start+1;
                arr[1]=end+1;
                break;
            }
            else if(numbers[start]+numbers[end]>target){
                end--;
            }else{
                start++;
            }
        }
        return arr;
    }
}
