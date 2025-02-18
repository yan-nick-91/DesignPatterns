package com.yann.designpatterns.creational.factory;

import com.yann.designpatterns.creational.factory.base.OperationSystem;

public class Main {
    public static void main(String[] args) {
        OperationSystem operationSystem = OperatingSystemFactory
                .getInstance("WINDOWS", "WIN11", "x64");
        OperationSystem operationSystem2 = OperatingSystemFactory
                .getInstance("LINUX", "DEB", "x64");

        System.out.println(operationSystem);
        System.out.println(operationSystem2);
    }
}
