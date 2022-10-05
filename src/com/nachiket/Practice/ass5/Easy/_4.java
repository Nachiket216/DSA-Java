package com.nachiket.Practice.ass5.Easy;

import java.util.Arrays;

public class _4 {
    public static void main(String[] args) {
        int[][] account = {{2,8,7},{7,1,3},{1,9,5}};

        System.out.println((richest(account)));
    }


//    My answer
    public static int richest(int[][] account){
        int max=0;
        int len = account.length;
        int[] arr = new int[len];

        for(int i=0; i<len; i++){
            for(int j=0; j< account[i].length; j++){
                arr[i] = arr[i] + account[i][j];
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int k=0; k<len; k++){
            if(arr[k]>max){
                max = arr[k];
            }
        }

        return max;
    }



//      Actual answer
//    public int maximumWealth(int[][] accounts) {
//        int res = 0;
//        for(int i =0;i<accounts.length;i++){
//            int temp = 0;
//            for(int j = 0;j<accounts[i].length;j++){
//                temp+=accounts[i][j];
//            }
//            res = Math.max(res,temp);
//        }
//        return res;
//
//
//    }
}
