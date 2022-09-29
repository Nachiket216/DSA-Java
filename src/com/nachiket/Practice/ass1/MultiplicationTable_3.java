package com.nachiket.Practice.ass1;
import java.util.*;
public class MultiplicationTable_3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<=10; i++){
            int b = num*i;
            System.out.println(num+"*"+i+"="+b);
        }
    }
}
