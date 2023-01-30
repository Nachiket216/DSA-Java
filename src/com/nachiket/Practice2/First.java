package com.nachiket.Practice2;

import java.util.Scanner;

public class First{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String bc =sc.next();
        System.out.println(fun(sc.nextInt()));

    }
    public static int fun(int i){
        System.out.println("bhai bhai");
        return ++i;
    }
}
 class second {
    public static void main(String[] args) {
        First s = new First();
        System.out.println(s.fun(2));
    }
}