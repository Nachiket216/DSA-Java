package com.nachiket.Practice.ass5.Easy;

public class _16 {
    public static void main(String[] args) {
        int[] num = {437,315,322,431,686,264,442};
        System.out.println(findNumbers(num));
    }
    public static int findNumbers(int [] num){
        int a=1,b,count=0;
        for(int i=0; i<num.length;i++){
            b=0;
            while(num[i]!=0){
                num[i]=num[i]/10;
                b++;
            }
            if(b%2==0){
                count++;
            }
        }
        return count;
    }
}
