package com.yann.designpatterns.creational.factory.base;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class OperationSystem {
    private String version;
    private String architecture;

    public abstract void changeDir(String dir);
    public abstract void removeDir(String dir);
}
