package com.yann.solid.dependencyinversion.bad;

public class Calculator {
    public int calculate(int a, int b, String operation) {
        int result;

        switch (operation) {
            case "add" -> {
                AddOperation addOperation = new AddOperation();
                result = addOperation.add(a, b);
            }
            case "sub" -> {
                SubOperation subOperation = new SubOperation();
                result = subOperation.sub(a, b);
            }
            default -> {
                return 0;
            }
        }
        return result;
    }
}
