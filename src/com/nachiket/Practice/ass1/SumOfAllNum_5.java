package com.nachiket.Practice.ass1;
import java.util.*;
public class SumOfAllNum_5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int total = 0 ;
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            total = a+total;

        }
        System.out.println(total);
    }
}
