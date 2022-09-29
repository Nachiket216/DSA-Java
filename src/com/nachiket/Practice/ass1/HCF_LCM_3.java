package com.nachiket.Practice.ass1;
import java.util.Scanner;
public class HCF_LCM_3 {
    public static void main(String []args){
        int hcf,lcm,temp;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a1 = a;
        int b = sc.nextInt();
        int b1 = b;
        while(b != 0 ){
            temp = b;
            b = a%b;;
            a = temp;
        }
        hcf = a;
        lcm = (a1*b1)/hcf;
        System.out.println(hcf);
        System.out.println(lcm);
    }
}
