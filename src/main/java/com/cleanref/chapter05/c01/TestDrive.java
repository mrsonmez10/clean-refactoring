package com.cleanref.chapter05.c01;

import java.util.Locale;

// Do not extend
public class TestDrive {

    // Example: "Tue, 02 Apr 2003 22:18:49 GMT"
    private final String HTTP_DATE_REGEXP =
            "[SMTWF][a-z]{2}\\,\\s[0-9]{2}\\s[JFMASOND][a-z]{2}\\s"+
                    "[0-9]{4}\\s[0-9]{2}\\:[0-9]{2}\\:[0-9]{2}\\sGMT";
    private String context;
    private Locale saveLocale;

}
