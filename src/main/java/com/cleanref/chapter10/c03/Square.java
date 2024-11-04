package com.cleanref.chapter10.c03;

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Karede genişlik ve yükseklik eşit olmalı
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height; // Karede genişlik ve yükseklik eşit olmalı
    }
}
