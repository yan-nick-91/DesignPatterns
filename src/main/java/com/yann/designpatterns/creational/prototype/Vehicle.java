package com.yann.designpatterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public abstract class Vehicle implements Cloneable {
    private String engine;
    private String model;
    private BigDecimal price;

    protected Vehicle clone() throws CloneNotSupportedException {
        return (Vehicle) super.clone();
    }
}
