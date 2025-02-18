package com.yann.solid.dependencyinversion.good;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        AddOperation addOperation = new AddOperation();
        var result = calculator.calculate(5, 5, addOperation); // -> 10
        System.out.println(result);

        SubOperation subOperation = new SubOperation();
        result = calculator.calculate(5, 5, subOperation); // -> 0
        System.out.println(result);
    }
}
