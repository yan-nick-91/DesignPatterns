package com.yann.designpatterns.creational.abstractfactory.uifactory;

import com.yann.designpatterns.creational.abstractfactory.Button;
import com.yann.designpatterns.creational.abstractfactory.Checkbox;
import com.yann.designpatterns.creational.abstractfactory.os.mac.MacButton;
import com.yann.designpatterns.creational.abstractfactory.os.mac.MacCheckbox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
