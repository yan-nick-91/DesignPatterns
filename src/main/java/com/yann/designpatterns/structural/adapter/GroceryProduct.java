package com.yann.designpatterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GroceryProduct implements GroceryItem {
    private String name;
    private BigDecimal price;
    private String storeName;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String getStoreName() {
        return storeName;
    }
}
