package com.cleanref.chapter03.c05.behavioral;

public class PublicVehicle extends Vehicle {
    public PublicVehicle(Drive driveCapability)
    {
        super(driveCapability);
    }
    public void drive()
    {
        super.drive();
    }

}