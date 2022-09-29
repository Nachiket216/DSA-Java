package com.nachiket.Practice.ass2;
import java.util.*;
public class EvenOrOdd_1 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
