package com.cleanref.chapter11.c06;

public class NewStack {
    protected Vector delegate;

    public NewStack() {
        delegate = new Vector();
    }

    public Object push(Object item) {
        delegate.addElement(item);
        return item;
    }
}
