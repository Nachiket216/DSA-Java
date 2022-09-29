package com.nachiket.dsa16;
import java.lang.reflect.Array;
import java.util.*;
public class SortedMatrixWithCreatingNewArray {
    public static void main(String[] args) {
         int[][] arr= {
                 {1,2,3,4},
                 {5,6,7,8},
                 {9,10,11,12},
                 {13,14,15,16}
         } ;
         int target = 11;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int target){
        int i=0;
//        int j = Array.getLength(arr);
        int[] fArr = new int[16];
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++){
                fArr[i] = arr[row][col];
                i++;
            }
        }
        return fArr;
    }
}
