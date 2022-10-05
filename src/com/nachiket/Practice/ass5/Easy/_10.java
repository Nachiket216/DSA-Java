package com.nachiket.Practice.ass5.Easy;

import java.util.Arrays;

public class _10 {
    public static void main(String[] args) {

    String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(str));
    }
    public static boolean checkIfPangram(String sentence){
        int len = sentence.length();
        int[] arr = new int[27];
        for (int i = 0; i < len; i++) {
            char word = sentence.charAt(i);
            switch (word){
                case 'a' : arr[1] = 1;break;
                case 'b' : arr[2] = 1;break;
                case 'c' : arr[3] = 1;break;
                case 'd' : arr[4] = 1;break;
                case 'e' : arr[5] = 1;break;
                case 'f' : arr[6] = 1;break;
                case 'g' : arr[7] = 1;break;
                case 'h' : arr[8] = 1;break;
                case 'i' : arr[9] = 1;break;
                case 'j' : arr[10] = 1;break;
                case 'k' : arr[11] = 1;break;
                case 'l' : arr[12] = 1;break;
                case 'm' : arr[13] = 1;break;
                case 'n' : arr[14] = 1;break;
                case 'o' : arr[15] = 1;break;
                case 'p' : arr[16] = 1;break;
                case 'q' : arr[17] = 1;break;
                case 'r' : arr[18] = 1;break;
                case 's' : arr[19] = 1;break;
                case 't' : arr[20] = 1;break;
                case 'u' : arr[21] = 1;break;
                case 'v' : arr[22] = 1;break;
                case 'w' : arr[23] = 1;break;
                case 'x' : arr[24] = 1;break;
                case 'y' : arr[25] = 1;break;
                case 'z' : arr[26] = 1;break;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==0){
                return false;
            }
        }
        return true;
    }

//    SOLUTION ON THE INTERNET

//    public boolean checkIfPangram(String sentence) {
//        if(sentence.length()<26) return false;
//        for(int i=1;i<=26;i++)
//            if(sentence.indexOf((char)i+96)<0)
//                return false;
//        return true;
//    }

}
