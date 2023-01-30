package com.nachiket.Practice.ass6_searching.Easy;

public class _2 {
    public static void main(String[] args) {

    }
//    public static int guessNumber(int n) {
//        int start = 0, end = n;
//
//        while(start<end){
//            int mid = start + (end-start)/2;
//
//            if(guess(mid)==-1){
//                end = mid-1;
//            }else if(guess(mid)==1){
//                start = mid+1;
//            }else{
//                return mid;
//            }
//        }
//        return 0;
//
//    }
}

//C++ Solution
//    int guessNumber(int n) {
//        int maxNumber = n, minNumber = 1;
//        while (true) {
//            int meanNumber = (maxNumber - minNumber) / 2 + minNumber;
//            // Do NOT use (maxNumber+minNumber)/2 in case of over flow
//            int res = guess(meanNumber);
//            if (res == 0) {
//                return meanNumber;
//            } else if (res == 1) {
//                minNumber = meanNumber + 1;
//            } else {
//                maxNumber = meanNumber - 1;
//            }
//        }
//    }