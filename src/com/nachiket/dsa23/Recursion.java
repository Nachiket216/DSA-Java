package com.nachiket.dsa23;

public class Recursion {
    public static void main(String[] args) {
        int n=1;
        recursion(n);
    }

    static void recursion(int n){
        if(n==50){
            return;
        }
        System.out.println(n);
        recursion(n+1);
    }
}