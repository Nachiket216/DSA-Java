package com.nachiket.codingninjas.Arrays;

import java.util.* ;
import java.io.*;

public class tp{
    public static void main(String[] args) {
        String input = "Geeks For Geeks";
        char[] temparray = input.toCharArray();
        int left, right = 0;
        right = temparray.length - 1;

        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = temp;
        }

        for (char c : temparray)
            System.out.print(c);
        System.out.println();


//        String s = "God Ding";
//        System.out.println(reverseWords(s));
//    }
//    public static String reverseWords(String s) {
//        String result = "";
//        for (int i=0; i<s.length(); i++){
//            if(s.charAt(i)) {
//                char initial = s.charAt(i);
//                result = initial + result;
//            }
//        }
//        return result;
    }

}
