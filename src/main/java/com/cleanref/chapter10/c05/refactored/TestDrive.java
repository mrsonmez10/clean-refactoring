package com.cleanref.chapter10.c05.refactored;

public class TestDrive {
    public static void main(String[] args) {
        Database mySQLDatabase = new MySQLDatabase();
        Database mongoDBDatabase = new MongoDBDatabase();

        OrderService orderServiceMySQL = new OrderService(mySQLDatabase);
        OrderService orderServiceMongoDB = new OrderService(mongoDBDatabase);

        orderServiceMySQL.placeOrder("Order #1");
        orderServiceMongoDB.placeOrder("Order #2");
    }
}
