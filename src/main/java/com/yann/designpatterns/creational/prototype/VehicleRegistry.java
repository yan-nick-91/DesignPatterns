package com.yann.designpatterns.creational.prototype;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private static final Map<VehicleType, Vehicle> mapVehicles = new HashMap<>();

    static {
        mapVehicles.put(VehicleType.TWO, new TwoWheelerVehicle(
                "120", "royal", new BigDecimal(100_000), false));

        mapVehicles.put(VehicleType.FOUR, new FourWheelerVehicle(
                "120", "bmw", new BigDecimal(100_000), false, true));
    }

    public Vehicle getVehicle(VehicleType vehicle) throws CloneNotSupportedException {
        return mapVehicles.get(vehicle).clone();
    }
}
