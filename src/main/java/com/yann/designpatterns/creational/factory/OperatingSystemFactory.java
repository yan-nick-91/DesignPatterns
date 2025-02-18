package com.yann.designpatterns.creational.factory;


import com.yann.designpatterns.creational.factory.base.OperationSystem;

public class OperatingSystemFactory {

    private OperatingSystemFactory() {

    }

    public static OperationSystem getInstance(String type, String version, String architecture) {
        return switch (type) {
            case "WINDOWS" -> new WindowsOperatingSystem(version, architecture);
            case "LINUX" -> new LinuxOperatingSystem(version, architecture);
            default -> throw new IllegalArgumentException("OS not supported");
        };
    }
}
