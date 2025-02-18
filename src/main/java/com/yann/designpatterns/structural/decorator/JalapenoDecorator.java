package com.yann.designpatterns.structural.decorator;

public class JalapenoDecorator extends PizzaDecorator {
    public JalapenoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return pizza.bake() + addJalapeno();
    }

    private String addJalapeno() {
        return "Jalapeno ";
    }
}
