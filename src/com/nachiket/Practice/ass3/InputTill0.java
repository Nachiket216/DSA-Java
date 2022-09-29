package com.nachiket.Practice.ass3;
import java.util.*;
public class InputTill0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input  = sc.nextInt();
        largestNumber(input);
    }
    static void largestNumber(int first){
        int temp=first;
        int r;
        int second = 0;
        while(first>0){
            r = first%10;
            second=(second*10)+r;
            first = first/10;
        }
        if (temp==second){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
