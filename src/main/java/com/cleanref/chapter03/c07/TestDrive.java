package com.cleanref.chapter03.c07;

public class TestDrive {

    public static void main(String[] args) {

        String file = "file";
        FlagMethod.save(file, true);


        FlagMethodRefactored.isVersionIncrement(file);
        FlagMethodRefactored.saveNew(file);

    }
}
