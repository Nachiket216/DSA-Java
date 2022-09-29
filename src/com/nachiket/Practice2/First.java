package com.nachiket.Practice2;

import java.util.*;
public class First {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNextInt()){
        int str= sc.nextInt();
        if(str%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        }

    }
}
