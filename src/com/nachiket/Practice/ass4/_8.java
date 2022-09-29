package com.nachiket.Practice.ass4;

import java.util.Scanner;

public class _8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Grade(a);
    }
    public static String Grade(int a){
        switch ((int)a/10){
            case 9:
                System.out.println("Grade : A+");
                break;
            case 8:
            case 7:
                System.out.println("Grade : A");
                break;
            case 6:
                System.out.println("Grade : B");
                break;
            case 5:
                System.out.println("Grade : C");
                break;
            default:
                System.out.println("Grade : D");
                break;
        }

        return "False Input";
    }
}
