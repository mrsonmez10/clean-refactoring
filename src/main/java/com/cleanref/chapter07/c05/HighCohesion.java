package com.cleanref.chapter07.c05;


import com.cleanref.chapter07.c05.helper.SomeObject;

public class HighCohesion {
    SomeObject someObject = new SomeObject();

    public void method1(){
        someObject.helloItsMe();;
    }
}
