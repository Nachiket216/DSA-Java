package com.nachiket.Practice.ass6_searching.Easy;

public class _1 {
    public static void main(String[] args) {
        int x =8;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int start = 0, end= Integer.MAX_VALUE;
        while(true){
            int mid = start+(end-start)/2;
            if(mid > x/mid){
                end = mid-1;
            }else{
                if(mid+1>x/(mid+1)){
                    return mid;
                }
                start = mid+1;
            }
        }
    }
}
