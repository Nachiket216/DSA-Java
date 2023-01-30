package com.nachiket.Practice.ass6_searching.Easy;
import java.util.*;
public class _7 {
    public static void main(String [] args){
        char[] letters= {'c','f','j'};
        char target ='z';
        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int length = letters.length;
        int i=0;
        while(i <= length){
            if(target>letters[length-1]){
                return letters[0];
            }else if(target == letters[i]){
                return letters[i];
            }else if(target < letters[i]) {
                return letters[i+1];
            }
            i++;
        }
        return target;
    }
}
