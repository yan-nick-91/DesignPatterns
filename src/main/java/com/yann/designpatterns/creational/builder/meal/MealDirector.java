package com.yann.designpatterns.creational.builder.meal;

import com.yann.designpatterns.creational.builder.meal.enums.Bread;
import com.yann.designpatterns.creational.builder.meal.enums.ColdDrink;

public class MealDirector {
    private final MealBuilder mealBuilder;
    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal prepareMeal(Bread bread, ColdDrink coldDrink) {
        mealBuilder.addBread(bread);
        mealBuilder.addBriyani();
        mealBuilder.addCurry();
        mealBuilder.addColdDrink(coldDrink);
        return mealBuilder.build();
    }
}
