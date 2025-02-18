package com.yann.designpatterns.creational.builder.meal;

import com.yann.designpatterns.creational.builder.meal.enums.Bread;
import com.yann.designpatterns.creational.builder.meal.enums.ColdDrink;

public interface MealBuilder {
    void addBriyani();
    void addBread(Bread bread);
    void addColdDrink(ColdDrink coldDrink);
    void addCurry();
    Meal build();
}
