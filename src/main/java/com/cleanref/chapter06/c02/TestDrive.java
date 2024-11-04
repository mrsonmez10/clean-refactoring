package com.cleanref.chapter06.c02;

public class TestDrive {
    int lineCount;
    int totalChars;

    // Space
    private void measureLine(String line){
        lineCount++;
        int lineSize=line.length();
        totalChars+=lineSize;
    }

}
