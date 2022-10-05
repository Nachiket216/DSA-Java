package com.nachiket.Practice.ass5.Easy;

import java.util.Arrays;

public class _12 {
    public static void main(String[] args) {
        int[] arr = {52,-91,72};
        System.out.println(largestAltitude(arr));
    }
    public static int largestAltitude(int[] gain) {
        int length = gain.length;
        int[] arr = new int[length+1];
        arr[0] = 0;
        arr[1] = gain[0];
        int value;
        for(int i=2; i<length+1; i++){
            arr[i]=arr[i-1]+gain[i-1];
        }
        System.out.println(Arrays.toString(arr));
        int max = 0;
        for(int i=0 ;i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }

        return max;
    }

//        public int largestAltitude(int[] gain) {
//            int max_alt=0;
//            int curr_alt=0;
//            for(int i=0;i<gain.length;i++){
//                curr_alt+=gain[i];
//                max_alt=Math.max(curr_alt, max_alt);
//            }
//            return max_alt;
//        }
}


