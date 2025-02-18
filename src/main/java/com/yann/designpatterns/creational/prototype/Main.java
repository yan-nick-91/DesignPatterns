package com.yann.designpatterns.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        VehicleRegistry vehicleRegistry = new VehicleRegistry();
        var result = vehicleRegistry.getVehicle(VehicleType.FOUR);
        System.out.println(result);
    }
}
