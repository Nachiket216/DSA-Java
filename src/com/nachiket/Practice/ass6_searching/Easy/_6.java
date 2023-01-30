package com.nachiket.Practice.ass6_searching.Easy;

public class _6 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(bs(n));
    }

    static int bs(int n) {
        int i=1;
        while(n>0){
            i++;
            n=n-i;
        }
        return i-1;
    }
}
