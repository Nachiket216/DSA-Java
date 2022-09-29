package com.nachiket.Practice.ass4;

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        System.out.println( "The largest number is "+ largest(first,second,third));
        System.out.println("The smallest NUmber is " + smallest(first, second, third));

    }
    public static int largest(int first, int second, int third){
        int large=0,max;
        if(first>second && first>third){
            large=first;
        }else if(second>third && second>first){
            large = second;
        }else{
            large= third;
        }

        return large;
    }

    public static int smallest (int first, int second, int third){
        int small=0;
        if(first<second && first<third){
            small=first;
        }else if(second<third && second <first ){
            small = second;
        }else{
            small = third;
        }
        return small;
    }
}
