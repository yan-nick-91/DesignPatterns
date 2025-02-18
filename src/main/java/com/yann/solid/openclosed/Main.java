package com.yann.solid.openclosed;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        var test = calculator.calculateNumber(4,4, new AddOperation());
        test = calculator.calculateNumber(test, 3, new SubstractOperation());
        System.out.println(test);
    }
}
