package com.cleanref.chapter03.c05.creational.singleton;

public class DefineSingleton {

    public static DefineSingleton ds = new DefineSingleton();

    private DefineSingleton() {
        // TODO Auto-generated constructor stub
    }


    public static DefineSingleton getInstance()
    {
        return ds;
    }
}