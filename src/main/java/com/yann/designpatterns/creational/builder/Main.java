package com.yann.designpatterns.creational.builder;

import com.yann.designpatterns.creational.builder.burger.Burger;
import com.yann.designpatterns.creational.builder.meal.*;
import com.yann.designpatterns.creational.builder.meal.enums.Bread;
import com.yann.designpatterns.creational.builder.meal.enums.ColdDrink;
import com.yann.designpatterns.creational.builder.meal.enums.Size;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger
                .BurgerBuilder()
                .size(Size.LARGE)
                .egg(true)
                .extraCheese(false)
                .mayonaise(true)
                .lettuce(true)
                .onion(false)
                .build();

        System.out.println(burger);

        MealDirector mealDirector1 = new MealDirector(new VegMealBuilder());
        var result1 = mealDirector1.prepareMeal(Bread.NAAN, ColdDrink.COCA_COLA);
        System.out.println(result1);

        MealDirector mealDirector2 = new MealDirector(new NonVegMealBuilder());
        var result2 = mealDirector2.prepareMeal(Bread.ROTI, ColdDrink.COCA_COLA_LIGHT);
        System.out.println(result2);
    }
}
