package com.nachiket.Practice.ass2;
import java.util.*;
public class Palindrome_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char ch;
        String nstr = "" ;
        for(int i=0; i<input.length(); i++){
            ch = input.charAt(i);
            nstr = ch+nstr;
        }
        System.out.println(nstr);
        if(nstr.equals(input)){
            System.out.println("equal");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
