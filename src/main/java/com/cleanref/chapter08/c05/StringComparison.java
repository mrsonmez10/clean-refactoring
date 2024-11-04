package com.cleanref.chapter08.c05;

public class StringComparison {

    public static void main(String[] args) {
        int n = 100000;  // Toplam birleştirme sayısı

        // 1. String ile birleştirme (+ operatoru)
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "test";
        }
        long endTime = System.nanoTime();
        System.out.println("String (+ ile): " + (endTime - startTime) / 1_000_000 + " ms");

        // 2. StringBuffer ile birleştirme
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append("test");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer: " + (endTime - startTime) / 1_000_000 + " ms");

        // 3. StringBuilder ile birleştirme
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append("test");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
