package com.nachiket.dsa9;

import java.util.Scanner;

public class Typecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().trim().charAt(0);
        if(c>='a' && c<='z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }
    }
}