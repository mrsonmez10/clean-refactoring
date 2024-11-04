package com.cleanref.chapter03.c05.behavioral;

public class TestDriveStrategy {
    /*
        These patterns focus on communication between objects, defining how objects interact and cooperate.
     */

    public static void main(String[] args) {

        Vehicle mercedes = new LuxuryVehicle(new LuxuryDrive());
        mercedes.drive();

        Vehicle audi = new SportsVehicle(new LuxuryDrive());
        audi.drive();

        Vehicle bmw = new LuxuryVehicle(new NormalDrive());
        bmw.drive();
    }
}
