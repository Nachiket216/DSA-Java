package com.nachiket.dsa13;
import java.util.*;

/////////////////////Kunal's Solution////////////////////
public class Linear_search{
    public static void main(String[] args) {
        int[] arr = {23,45,1,2,8,19,-3,16,-11,28};
        Scanner sc = new Scanner (System.in);
        int target = sc.nextInt();
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target ){
                return index;
            }
        }

        return -1;
    }
}

///////////////////My Solution////////////////////////
//public class Linear_search {
//    static Scanner in  = new Scanner(System.in);
//    static int[] arr = new int[5];
//    public static void main(String[] args) {
//
//        insert();
//        search();
//    }
//    static void insert(){
//        for(int i = 0; i<arr.length; i++){
//            arr[i]= in.nextInt();
//        }
//    }
//    static void search(){
//        System.out.println("Enter the number you want to search");
//        int search = in.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==search){
//                System.out.println("The index is"+i);
//            }
//        }
//    }
//}

