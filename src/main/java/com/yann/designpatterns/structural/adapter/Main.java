package com.yann.designpatterns.structural.adapter;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        SwiggyStore swiggyStore = new SwiggyStore();
        swiggyStore.addItems(new FoodItem("Pork", new BigDecimal(5), "Meat place"));
        swiggyStore.addItems(new FoodItem("Steak", new BigDecimal(8), "Steakhouse"));
        swiggyStore.addItems(new GroceryItemAdapter(new GroceryProduct("Melon", BigDecimal.valueOf(1.50), "Mr. Fruit")));

        System.out.println(swiggyStore.getItems());
    }
}
