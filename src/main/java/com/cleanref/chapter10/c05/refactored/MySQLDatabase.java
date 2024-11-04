package com.cleanref.chapter10.c05.refactored;

class MySQLDatabase implements Database {
    @Override
    public void saveOrder(String order) {
        System.out.println("Order saved to MySQL database: " + order);
    }
}
