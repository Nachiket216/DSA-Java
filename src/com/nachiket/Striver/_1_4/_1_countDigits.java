package com.nachiket.Striver._1_4;

public class _1_countDigits {
    public static void main(String[] args) {
     int n = 12;
        System.out.println(evenlyDivides(n));
    }
    static int evenlyDivides(int N){
        int temp = N;
        int count=0;
        while(N!=0){
            int a = N%10;
            if(a!=0&&temp%a==0){
                count++;
            }
            N=N/10;
        }
        return count;
    }
}
