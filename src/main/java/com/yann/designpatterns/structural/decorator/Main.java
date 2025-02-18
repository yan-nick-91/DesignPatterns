package com.yann.designpatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        PizzaDecorator pizza1 = new JalapenoDecorator(new BasePizza());
        var result1 = pizza1.bake();
        System.out.println(result1);

        PizzaDecorator pizza2 = new CheeseBurstDecorator(new BasePizza());
        var result2 = pizza2.bake();
        System.out.println(result2);

        PizzaDecorator pizza3 = new JalapenoDecorator(
                new CheeseBurstDecorator(
                        new BasePizza()));
        var result3 = pizza3.bake();
        System.out.println(result3);
    }
}
