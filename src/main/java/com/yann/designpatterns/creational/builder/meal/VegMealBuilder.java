package com.yann.designpatterns.creational.builder.meal;

import com.yann.designpatterns.creational.builder.meal.enums.Bread;
import com.yann.designpatterns.creational.builder.meal.enums.ColdDrink;

public class VegMealBuilder implements MealBuilder {
    private final Meal meal;

    public VegMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    public void addBriyani() {
        this.meal.setBriyani("Veg");
    }

    @Override
    public void addBread(Bread bread) {
        this.meal.setBread(bread);
    }

    @Override
    public void addColdDrink(ColdDrink coldDrink) {
        this.meal.setColdDrink(coldDrink);
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Veg");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
