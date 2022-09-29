package com.nachiket.Practice;

import java.util.*;
public class SearchInMultiDimArray {
    public static void main(String[] args) {
        int[][] arr = {
                {18,9,12},
                {36,-4,91},
                {44,33,16}
        };
        int target = 36;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search (int[][] arr,int target){
        for(int row= 0; row<arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
    return new int[] {-1,-1};
    }
}
