package com.nachiket.dsa9;

import java.util.Scanner;

public class Finding_number {
    public static void main(String[] args) {
        int n=1385757879;
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem==8){
                count++;
            }

            n=n/10;
//            System.out.println(n);
        }
        System.out.println(count);

    }
}
