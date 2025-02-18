package com.yann.solid.dependencyinversion.good;

public class SubOperation implements CalculatorOperation {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
