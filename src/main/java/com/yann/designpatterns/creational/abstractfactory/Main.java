package com.yann.designpatterns.creational.abstractfactory;

import com.yann.designpatterns.creational.abstractfactory.uifactory.MacUIFactory;
import com.yann.designpatterns.creational.abstractfactory.uifactory.UIFactory;
import com.yann.designpatterns.creational.abstractfactory.uifactory.WinUIFactory;

public class Main {
    public static void main(String[] args) {
        UIFactory uiFactory1 = new WinUIFactory();
        Application application1 = new Application(uiFactory1);
        application1.paint();

        UIFactory uiFactory2 = new MacUIFactory();
        Application application2 = new Application(uiFactory2);
        application2.paint();
    }
}
