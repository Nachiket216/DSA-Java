package com.nachiket.Practice.ass3;

import java.util.Scanner;

public class Last26 {
    public static void main(String[] args) {
        process();
    }
    static void  process(){
        int input=1,negative=0,odd=0, even=0;
        Scanner ob = new Scanner(System.in);
        while(input != 0 ){
            input= ob.nextInt();
            if(input < 0){
                negative = negative+input;
            }else if(input%2 == 0){
                even= even+input;
            }else{
                odd = odd+input;
            }
        }
        System.out.println("Addition of Negative" + negative);
        System.out.println("Addition of even " + even);
        System.out.println("Addition of odd " + odd);

    }
}
