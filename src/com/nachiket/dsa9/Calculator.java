package com.nachiket.dsa9;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press x or x
        double output = 0;
        while(true){
            System.out.println("Enter the operator");
            char i = in.next().trim().charAt(0);
            if(i == '+' || i == '-' || i == '*' || i == '/' || i == '%'){
            System.out.println("Enter two numbers:");
            int a = in.nextInt();
            int b = in.nextInt();
                if(i == '+'){
                    output = a+b;
                }
                if(i == '-'){
                    output = a-b;
                }
                if(i == '*'){
                    output = a*b;
                }
                if(i == '/'){
                    output = a/b;
                }
                if(i == '%'){
                    output = a%b;
                }
            }
            else if(i == 'x' || i == 'X'){
                break;
            }
            else{
                System.out.println("Invalid input");
            }
            System.out.println(output);
        }
    }
}
