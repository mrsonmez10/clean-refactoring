package com.cleanref.chapter08.c01;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptionExample {

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("dosya.txt");
            int data = file.read();
            while (data != -1) {
                System.out.print((char) data);
                data = file.read();
            }
            file.close();
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }


        try {
            Class.forName("com.example.SinifAdi");
        } catch (ClassNotFoundException e) {
            System.out.println("Sınıf bulunamadı: " + e.getMessage());
        }


        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "kullanici", "sifre");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Veritabanı bağlantı hatası: " + e.getMessage());
        }
    }

}
