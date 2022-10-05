package com.nachiket.Practice.ass5.Easy;

import java.util.Arrays;

public class _17 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7,8,9}
        };
        System.out.println(Arrays.deepToString(transpose(arr)));
    }


    public static int[][] transpose(int[][] matrix) {
        int length = matrix.length;
        int[][] arr = new int[length][matrix[0].length];

        if (length == matrix[0].length) {
            fun(matrix,arr,length);
        } else {
            arr = new int[matrix[0].length][length];
            fun(matrix,arr,length);
        }
        return arr;
    }

    public static int[][] fun(int[][]matrix,int[][] arr,int length){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
    }
}

// Their solution
//class Solution {
//    public int[][] transpose(int[][] matrix) {
//        int[][] newmat = new int[matrix[0].length][matrix.length];
//
//        for (int i = 0; i < newmat.length; i++) {
//            for (int j = 0; j < newmat[i].length; j++) {
//                newmat[i][j] = matrix[j][i];
//            }
//        }
//        return newmat;
//    }
//}