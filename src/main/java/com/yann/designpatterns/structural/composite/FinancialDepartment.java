package com.yann.designpatterns.structural.composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FinancialDepartment implements Department {
    private int id;
    private String name;

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
