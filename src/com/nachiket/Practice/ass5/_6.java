package com.nachiket.Practice.ass5;

import java.util.ArrayList;
import java.util.List;

public class _6 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extracandies = 3;
        System.out.println(kidsWithCandies(candies, extracandies));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int length = candies.length;
        int max=0;
        List<Boolean> result = new ArrayList<Boolean>();
        for (int i = 0; i < length; i++) {
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for (int i = 0; i < length; i++) {
            if(candies[i]+extraCandies >= max){
                result.add(true);
            }else {
                result.add(false);
            }
        }
//        System.out.println(max);
        return result;
    }
}
