package com.nachiket.Practice.ass4;

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(eligible(a));
    }
    public static boolean eligible(int a){
        if( a >=18){
            return true;
        }else{
            return false;
        }
    }
}
