package com.yann.designpatterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FoodItem implements Item {
    private String name;
    private BigDecimal price;
    private String restaurantName;
    @Override
    public String getItemName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String getRestaurantName() {
        return restaurantName;
    }
}
