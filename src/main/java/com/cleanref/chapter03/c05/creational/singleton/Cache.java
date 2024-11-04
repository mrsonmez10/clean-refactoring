package com.cleanref.chapter03.c05.creational.singleton;

public interface Cache <F,S>{

    void put(F key, S value);
    S get(F key);

}