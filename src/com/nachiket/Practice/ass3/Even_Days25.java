package com.nachiket.Practice.ass3;

public class Even_Days25 {
    public static void main(String[] args){
        System.out.println(process());
    }

    static int process(){
        int total=0;
        int days = 31;
        for(int i =1 ;i<=days; i++){
            if(i%2 == 0 ){
                total++;
            }
        }

        return total;
    }
}
