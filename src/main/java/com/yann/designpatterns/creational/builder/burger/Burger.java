package com.yann.designpatterns.creational.builder.burger;

import com.yann.designpatterns.creational.builder.meal.enums.Size;
import lombok.ToString;

@ToString
public class Burger {
    private final Size size;
    private final boolean egg;
    private final boolean extraCheese;
    private final boolean mayonnaise;
    private final boolean onion;
    private final boolean lettuce;

    private Burger(BurgerBuilder burgerBuilder) {
        this.size = burgerBuilder.size;
        this.egg = burgerBuilder.egg;
        this.extraCheese = burgerBuilder.extraCheese;
        this.mayonnaise = burgerBuilder.mayonnaise;
        this.onion = burgerBuilder.onion;
        this.lettuce = burgerBuilder.lettuce;
    }

    public static class BurgerBuilder {
        private Size size;
        private boolean egg;
        private boolean extraCheese;
        private boolean mayonnaise;
        private boolean onion;
        private boolean lettuce;

        public BurgerBuilder size(Size size) {
            this.size = size;
            return this;
        }

        public BurgerBuilder egg(boolean egg) {
            this.egg = true;
            return this;
        }

        public BurgerBuilder extraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public BurgerBuilder mayonaise(boolean mayonnaise) {
            this.mayonnaise = mayonnaise;
            return this;
        }

        public BurgerBuilder onion(boolean onion) {
            this.onion = onion;
            return this;
        }

        public BurgerBuilder lettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
