package com.cleanref.chapter10.c05.refactored;

class OrderService {
    private Database database;

    public OrderService(Database database) {
        this.database = database;
    }

    public void placeOrder(String order) {
        database.saveOrder(order);
        System.out.println("Order placed successfully.");
    }
}