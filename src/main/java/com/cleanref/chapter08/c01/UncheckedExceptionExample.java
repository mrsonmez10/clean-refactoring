package com.cleanref.chapter08.c01;

public class UncheckedExceptionExample {

    public static void main(String[] args) {

        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Null değerine erişilmeye çalışıldı: " + e.getMessage());
        }


        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Geçersiz dizi indeksi: " + e.getMessage());
        }


        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Aritmetik hata: " + e.getMessage());
        }


        String textTwo = "123a";
        try {
            int number = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Geçersiz sayı formatı: " + e.getMessage());
        }

    }

}
