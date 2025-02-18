package com.yann.designpatterns.creational.prototype;

import java.math.BigDecimal;

public class TwoWheelerVehicle extends Vehicle {
    private final boolean isElectric;

    public TwoWheelerVehicle(String engine, String model, BigDecimal price, boolean isElectric) {
        super(engine, model, price);
        this.isElectric = isElectric;
    }

    @Override
    public TwoWheelerVehicle clone() throws CloneNotSupportedException {
        return (TwoWheelerVehicle) super.clone();
    }

    @Override
    public String toString() {
        return "TwoWheelerVehicle{" +
                "isElectric=" + isElectric +
                ", engine='" + getEngine() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
