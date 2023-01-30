package com.nachiket.A_LeetCode_Daily_Challenge;

import java.util.Objects;

public class _433 {
    public static void main(String[] args) {
        String start = "AAAAACCC";
        String end = "AACCCCCC";
        String[] bank = {"AAAAACCC"};
        System.out.println(minMutation(start,end,bank));
    }
    public static int minMutation(String start, String end, String[] bank) {
        char[] s = start.toCharArray();
        char[] e = end.toCharArray();
        int i1=0,i=0,j=0;
        if(bank.length==0){
            return -1;
        }
        while(i1 <bank.length){
            if(Objects.equals(bank[i1], end)){
                while(i<s.length){
                    if(s[i]!=e[i]){
                        j++;
                    }
                    i++;
                }
            }
            i1++;
        }

        return j;
    }
}
