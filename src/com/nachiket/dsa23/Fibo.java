package com.nachiket.dsa23;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(recursion(10));
    }
    static int recursion(int n){
        if(n<2){
            return n;
        }

        return recursion(n-1)+recursion(n-2);
    }
}
