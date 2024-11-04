package com.cleanref.chapter08.c03;

public class TestDrive {

    // özelden Genele olmalı!

    public void exampleMethod() {
        try {
            // Hata oluşturabilecek kodlar burada çalıştırılacak
        } catch (NullPointerException e) {
            // NullPointerException için özel işlem
        } catch (IllegalArgumentException e) {
            // IllegalArgumentException için özel işlem
        } catch (RuntimeException e) {
            // RuntimeException için genel işlem
        } catch (Exception e) {
            // En genel exception işlemi
        }
    }

}
