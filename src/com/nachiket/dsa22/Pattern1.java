package com.nachiket.dsa22;

public class Pattern1 {
    public static void main(String[] args) {
        int n =5;
        pattern30(n);
    }

    static  void pattern30(int n){
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n-row; space++) {
                System.out.print(" ");
            }
            for (int col = row ; col >=1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2 ; col <=row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for(int row=1; row<=n*2-1; row++){
            int totalColInRow = row > n ? 2*n-row : row;

            int noOfSpaces = n-totalColInRow;
            for(int s=0; s<noOfSpaces; s++){
                System.out.print(" ");
            }
            for(int col=0; col<totalColInRow; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int row=1; row<=n*2-1; row++){
            if(row<=n){
                for(int col=1; col<=row; col++){
                    System.out.print("*");
                }
            }if(row>n){
                for(int col =n; col>row-n; col--){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row =1;row<=n; row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
