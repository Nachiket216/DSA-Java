package com.nachiket.Practice.ass3;

import java.util.Scanner;

public class Largest25 {
    public static void main(String[] args){
        System.out.println(Process());
    }
    static int Process(){
        int largest =0,input=1 ;
        Scanner sc = new Scanner(System.in);
        while(input != 0){
            input = sc.nextInt();
            if(input>largest){
                largest=input;
            }
        }


        return  largest;
    }
}
