package com.nachiket.Practice.ass3;
import java.util.*;
public class p_and_a {
    public static void main(String[] args) {
        int b = 234;
        System.out.println(subtractProductAndSum(b));
    }

    public static int subtractProductAndSum(int n) {
        int add=0, product=1;
        while (n > 0) {
            int bhai = n%10;
            add = bhai+add;
            product = bhai*product;
            n = n / 10;
        }
        return product-add;
    }
}


//        int product=1,add=0,something;
//        while(n>0){
//            something = n%10;
//            product = something*product;
//            add = something+add;
//            n=n/10;
//        }
//        return product-add;

