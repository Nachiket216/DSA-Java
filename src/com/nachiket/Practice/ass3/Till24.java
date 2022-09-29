package com.nachiket.Practice.ass3;

import java.util.*;

public class Till24 {
    public static void main (String [] args){
        System.out.println(process());
    }
    public static int process(){
        Scanner sc = new Scanner(System.in);
        int input=1;
        int sum=0;
        while(input !=0){
            input =  sc.nextInt();
            sum = sum+input;
        }
        return sum;
    }

}
