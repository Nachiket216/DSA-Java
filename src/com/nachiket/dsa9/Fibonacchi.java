package com.nachiket.dsa9;

import java.util.Scanner;

public class Fibonacchi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count<=input){
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }

    }
