package com.nachiket.Practice.ass5.Easy;

        import java.util.Arrays;

public class _13 {
    public static void main(String[] args) {
        int [][] arr = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println(Arrays.deepToString(flip(arr)));
    }
    public static int[][] flip(int [][] image){
        int length = image.length;
        int size,temp;
        for (int i = 0; i < length; i++) {
            size = image[i].length;
            for (int j = 0; j < size/2; j++) {
                temp = image[i][j];
                image[i][j] = image[i][size-(1+j)];
                image[i][size-(1+j)] = temp;
            }
            for(int j=0; j<size; j++){
                if(image[i][j] == 0){
                    image[i][j] =1;
                }else{
                    image[i][j] =0;
                }
            }
        }
        return image;

    }


//    Their Solution

    public int[][] flipAndInvertImage(int[][] image) {
        for(int A[]:image){
            swap(A);
            flip(A);
        }
        return image;
    }
    void swap(int A[]){
        int i=0;int j=A.length-1;
        while(i<=j){
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
            i++;
            j--;
        }
    }
    void flip(int A[]){
        for(int i=0;i<A.length;i++){
            if(A[i]==0) A[i]=1;
            else
                A[i]=0;
        }
    }
}
