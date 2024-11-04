package com.cleanref.chapter10.c05;

class OrderService {
    private MySQLDatabase database;

    public OrderService() {
        this.database = new MySQLDatabase();
    }

    public void placeOrder(String order) {
        database.saveOrder(order);
        System.out.println("Order placed successfully.");
    }
}