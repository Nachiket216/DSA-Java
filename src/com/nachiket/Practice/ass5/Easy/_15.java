package com.nachiket.Practice.ass5.Easy;

public class _15 {
    public static void main(String[] args) {
        int[][] mat= {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},

        };
        System.out.println(bhai(mat));
    }
    public static int bhai(int [][] mat){
        int length = mat.length;
        int sum=0,num=0,len,j;
        for (int i = 0; i < length ; i++) {
            for(j=0; j<mat[i].length; j++){
                len = mat[i].length;

                sum= mat[i][j+num]+mat[i][len-num-1] +sum;
                num++;
                break;
            }
        }
        if(length%2!=0) {
            int mid = (length - 1) / 2;
            sum = sum - mat[mid][mid];
        }
        return sum;
    }
}


//Their answer

//class Solution {
//    public int diagonalSum(int[][] mat) {
//        int sum=0;
//        int n= mat.length;
//        for (int i=0; i<n; i++){
//            sum = sum + mat[i][i] + mat[i][n-i-1];
//        }
//        if (n%2!=0)
//            return sum-mat[n/2][n/2];
//        else
//            return sum;
//    }
//}
