package com.nachiket.Practice.ass4;

import java.util.Scanner;

public class _7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isPrime(a));
    }


    public static boolean isPrime(int a){
        int i = 2;
        while(i<a){
            if(a%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
