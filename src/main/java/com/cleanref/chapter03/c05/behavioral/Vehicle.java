package com.cleanref.chapter03.c05.behavioral;

// CONTEXT
public class Vehicle {
    Drive driveCapability;

    public Vehicle(Drive driveCapability)
    {
        this.driveCapability = driveCapability;
    }
    public void drive()
    {
        driveCapability.drive();
    }
}