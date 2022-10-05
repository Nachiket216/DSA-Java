package com.nachiket.dsa16;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(matrix,49 )));
    }
    static int[] search(int [][] matrix,int target){
        int row = 0;
        int col = matrix.length-1;
        while(row<matrix.length && col>=0){
            if(target==matrix[row][col]){
                return new int[]{row,col};
            }
            if(matrix[row][col]<target){
                row++;
            }
            if(matrix[row][col]>target){
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
