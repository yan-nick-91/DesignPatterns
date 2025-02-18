package com.yann.designpatterns.structural.adapter;

import java.math.BigDecimal;

public interface Item {
    String getItemName();
    BigDecimal getPrice();
    String getRestaurantName();
}
