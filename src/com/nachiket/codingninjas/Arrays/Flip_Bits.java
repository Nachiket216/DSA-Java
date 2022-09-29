package com.nachiket.codingninjas.Arrays;

import java.util.* ;
import java.io.*;

public class Flip_Bits{
    public static void main(String[] args) {
        int[] arr = {0 ,0, 1, 0 ,0};
        int n = arr.length;
        int sum = flipBits(arr, n);
        System.out.println(sum);
    }


    /*
    Solution on the internet | code studio discuss tab
     */
    public static int flipBits(int[] arr,int n) {
        // count for counting zeros and x for count ones.

        int count=0, maxcount=0, x=0;

        for(int i=0; i<n; i++)
        {
            if(arr[i]==0){
                count++;
            }
            else {
                count--;
                x++;
            }

            if(count>maxcount){
                maxcount=count;
            }
            if(count<0){
                count=0;
            }

        }

        return maxcount+x;
    }




    /*
    My Solution
     */



//    public static int flipBits(int[] arr,int n) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        int i,num =0,j=0,index1=0,index0 =0,literal=0;
//        for (i = 0; i < n; i++) {
//
//            if(arr[i]==0){
//                int zeros=0;
//                int index;
//                for(index=i;index<n;index++){
//                    if(arr[index]==1){
//                        break;
//                    }
//                    zeros++;
//                }
//                list.add(zeros);
//            }
//            if(arr[i]==0){
//                index0++;
//            }else{
//                index1++;
//            }
//
//            if(index0>index1){
//                for(int loop=0;loop<n;loop++){
//                    if(arr[loop]==0){
//                        literal++;
//                    }
//                }
//                return literal;
//            }
//
//
//
//            if(arr[i]==1){
//                num++;
//            }
//        }
//        for(int sum =0;sum<n;sum++){
//            if(arr[sum]==1){
//                j++;
//            }
//        }
//        if(j==n){
//            return j;
//        }
//
////        System.out.println(list);
//        int listitem = Collections.max(list);
//        return num+listitem;
//    }

}
