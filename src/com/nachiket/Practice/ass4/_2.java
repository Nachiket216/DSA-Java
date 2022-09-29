package com.nachiket.Practice.ass4;

import java.util.*;
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(EvenOrOdd(a)==true){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
    public static boolean EvenOrOdd ( int a){
        if(a%2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
