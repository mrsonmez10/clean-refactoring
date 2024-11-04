package com.cleanref.chapter03.c04;

public class TestDrive {

    // https://trekhleb.medium.com/solid-principles-around-you-6db2f0e12139 :: O

    public static void main(String[] args) {

        String isim = "Ali";
        switch (isim) {
            case "Ali":
                // Do stuff
                break;
            case"Veli":
            case"Nicholai":
                // Do stuff
                break;
            case"Hell":
                // Do stuff
                break;
            default:
                // Do stuff
        }
    }

}
