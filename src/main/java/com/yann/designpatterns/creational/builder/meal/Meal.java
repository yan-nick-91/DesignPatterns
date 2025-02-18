package com.yann.designpatterns.creational.builder.meal;

import com.yann.designpatterns.creational.builder.meal.enums.Bread;
import com.yann.designpatterns.creational.builder.meal.enums.ColdDrink;
import lombok.Data;

@Data
public class Meal {
    private String curry;
    private Bread bread;
    private ColdDrink coldDrink;
    private String briyani;
}
