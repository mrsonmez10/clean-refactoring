package com.cleanref.chapter03.c08;

public class AssertExample {

    public static void assertEquals(String expected, String actual) {
        if (expected.equalsIgnoreCase(actual)){
            // Do stuff..
        }
    }

    public static void assertEqualsTriad(String message, String expected, String actual){
        if (expected.equalsIgnoreCase(actual)){
            // Do stuff..
        }
    }

}
