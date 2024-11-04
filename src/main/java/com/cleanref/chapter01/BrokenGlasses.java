package com.cleanref.chapter01;

public class BrokenGlasses {

    public static String convertLetters(String types)
    {
        if(types.equalsIgnoreCase("F"))
        {
            return "f";
        }
        else if (types.equalsIgnoreCase("S"))
        {
            return "s";
        }
        else if (types.equalsIgnoreCase("Q"))
        {
            return "q";
        }
        else if (types.equalsIgnoreCase("M"))
        {
            return "m";
        }

        return "";
    }


    public static void main(String[] args) {

        /**
         * Comparison rules
         */

        String a = null;

        if("F".equalsIgnoreCase(a)) {

        }

        if(a.equalsIgnoreCase("F")) {

        }

    }
}
