package com.nachiket.dsa13;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
            String name = "Nachiket";
            char target = 'a';
        System.out.println(search2(name,target));

//        TO CREATE A CHARACTER ARRAY
        System.out.println(Arrays.toString(name.toCharArray()));

        }
    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            if(target == str.charAt(index)){
                return true;
            }
        }
        return false;
    }
}

