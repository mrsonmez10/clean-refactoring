package com.cleanref.chapter08.c06;

public class TestDrive {

    public static void main(String[] args) throws IncorrectFileNameException {

        // Bilinmesi gereken bazı exceptionlar

        /*
         *  IllegalArgumentException
         *  IllegalStateException
         * 	NullPointerException
         *  ArrayIndexOutOfBoundsException
         *  ConcurrentModificationException
         *  UnsupportedOperationException
         */


        // IllegalArgumentException
		String isim = "asd";
		switch (isim) {
		case "Ali":
			// Do stuff
			break;
		case "Veli":
			// ..
			break;
		default:
			throw new IllegalArgumentException("No Provider");
		}



        // IllegalStateException
        // Dosyayı açmadan okumaya çalışmak

        // NullPointerException
		String ali = null;
		if(ali.equals("asd")) {
			throw new NullPointerException("Hata");
		}
		if ("asd".equalsIgnoreCase(ali)) {

		}



        try {

        } catch (Exception e) {
            // TODO: handle exception
            // bu excepiton hayati derecede kritik değil ctd flow
        }

    }

}
