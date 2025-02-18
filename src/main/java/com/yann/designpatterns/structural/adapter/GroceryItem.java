package com.yann.designpatterns.structural.adapter;

import java.math.BigDecimal;

public interface GroceryItem {
    String getName();
    BigDecimal getPrice();
    String getStoreName();
}
