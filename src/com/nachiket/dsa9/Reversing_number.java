package com.nachiket.dsa9;

public class Reversing_number {
    public static void main(String[] args) {
        int  n = 23597;
        int rev,num = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            num=num*10+rem;
        }
        System.out.println(num);
    }
}
