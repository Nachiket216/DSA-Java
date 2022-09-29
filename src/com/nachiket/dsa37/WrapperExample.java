package com.nachiket.dsa37;

//public class WrapperExample {
//    public static void main(String[] args) {
//        int a =10;
//        int b=20;
//        System.out.println(swap(a,b));
//
//        System.out.println(a+""+ b);
//
////        Wrapper class
//        Integer num =45;
//        num.toString();
//    }
//
//    static int swap(int a, int b){
//        int temp = a;
//        a=b;
//        b=temp;
//        return a;
//    }
//}
public class WrapperExample {
    public static void main(String[] args) {
        Integer a =10;
        Integer b=20;
        swap(a,b);
        System.out.println(a+""+ b);
    }

    static int swap(Integer a, Integer b){
        int temp = a;
        a=b;
        b=temp;
        return a;
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}