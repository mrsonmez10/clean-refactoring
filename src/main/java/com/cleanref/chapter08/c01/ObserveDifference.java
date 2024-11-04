package com.cleanref.chapter08.c01;

import java.io.FileReader;
import java.io.IOException;

public class ObserveDifference {

    public static void main(String[] args) {

        ObserveDifference observeDifference = new ObserveDifference();
        observeDifference.exampleMethod();

    }

    public void exampleMethod() {
        try {
            // Kod burada çalıştırılacak
        } catch (NullPointerException e) {

        }
    }

    public void exampleMethodTwo() throws IOException {

        FileReader file = new FileReader("dosya.txt");
        int data = file.read();
        while (data != -1) {
            System.out.print((char) data);
            data = file.read();
        }
        file.close();
    }

}


