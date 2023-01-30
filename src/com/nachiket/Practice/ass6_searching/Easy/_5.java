package com.nachiket.Practice.ass6_searching.Easy;

public class _5 {
    public static void main(String[] args) {
        int num=40000;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        long mid;
        while(start<=end){
            mid =start+(end-start)/2;
            if(mid*mid==num){
                return true;
            }else if(mid*mid >num){
                end = (int)mid-1;
            }else{
                start = (int)mid+1;
            }
        }
        return false;
    }
}
