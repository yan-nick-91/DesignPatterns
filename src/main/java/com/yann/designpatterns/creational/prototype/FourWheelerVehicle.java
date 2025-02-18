package com.yann.designpatterns.creational.prototype;

import java.math.BigDecimal;

public class FourWheelerVehicle extends Vehicle {
    private boolean automatic;
    private boolean isDiesel;
    public FourWheelerVehicle(String engine, String model, BigDecimal price, boolean automatic, boolean isDiesel) {
        super(engine, model, price);
        this.automatic = automatic;
        this.isDiesel = isDiesel;
    }

    public FourWheelerVehicle clone() throws CloneNotSupportedException {
        return (FourWheelerVehicle) super.clone();
    }

    @Override
    public String toString() {
        return "FourWheelerVehicle{" +
                "automatic=" + automatic +
                ", isDiesel=" + isDiesel +
                ", engine='" + getEngine() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +'}';
    }
}
