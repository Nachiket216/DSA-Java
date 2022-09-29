package com.nachiket.Practice.ass2;
import java.util.*;
public class Calculator_4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char operator = sc.next().charAt(0);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =0;
        switch (operator){
            case '+' :  c=a+b;break;
            case '-' : c=a-b;break;
            case '*' : c=a*b;break;
            case '/' : c=a/b;
        }
        System.out.println(c);
    }
}
