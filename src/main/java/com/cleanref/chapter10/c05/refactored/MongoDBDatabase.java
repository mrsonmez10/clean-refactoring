package com.cleanref.chapter10.c05.refactored;

class MongoDBDatabase implements Database {
    @Override
    public void saveOrder(String order) {
        System.out.println("Order saved to MongoDB database: " + order);
    }
}