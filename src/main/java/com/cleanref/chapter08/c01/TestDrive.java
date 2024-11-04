package com.cleanref.chapter08.c01;

public class TestDrive {

    public static void main(String[] args) {
        // Part1: Exception nedir? -> İstisna
        // ne zaman kullanırız?


        //  Eğer hatayı yönetmeseydik.
        ArrayOperations operations = new ArrayOperations();
        int[] numbers2 = new int[7];
        System.out.println("Metot çağırımı");
        operations.putValue(numbers2, 10, 27);
        System.out.println("Burayı göremezsin");


        /*
            Exception tipleri:
            - checkedException
            - uncheckedException
         */

    }

}
