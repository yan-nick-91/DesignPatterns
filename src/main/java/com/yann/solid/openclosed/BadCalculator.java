package com.yann.solid.openclosed;


public class BadCalculator {
    public int calculate(int number1, int number2, String type) {
        return switch (type) {
            case "sum" -> number1 + number2;
            case "sub" -> number1 - number2;
            default -> 0;
        };
    }
}
