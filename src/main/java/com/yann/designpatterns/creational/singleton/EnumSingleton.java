package com.yann.designpatterns.creational.singleton;

public enum EnumSingleton {
    INSTANCE;
    public void doSomething() {
        System.out.println("Cool");
    }
}
