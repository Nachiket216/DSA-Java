package com.nachiket.Practice.ass2;

import java.util.Scanner;

public class MessageForName_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String name = sc.nextLine();
            if (name.equals("Nachiket")) {
                System.out.println("Hello bhai");
            } else if (name.equals("Mihir")) {
                System.out.println("Dagabaz");
            } else {
                System.out.println("Chal nikal");
                break;
            }
        }
    }
}
