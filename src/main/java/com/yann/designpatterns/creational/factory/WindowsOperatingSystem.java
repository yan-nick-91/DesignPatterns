package com.yann.designpatterns.creational.factory;

import com.yann.designpatterns.creational.factory.base.OperationSystem;

public class WindowsOperatingSystem extends OperationSystem {
    public WindowsOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {

    }

    @Override
    public void removeDir(String dir) {

    }
}
