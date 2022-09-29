package com.nachiket.Practice.ass1;
import java.util.*;
public class leap_year1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int year = sc.nextInt();
            if(year%4 == 0 ){
                System.out.println("leap year");
            }else{
                System.out.println("not a lear year");
            }
        }
    }
}
