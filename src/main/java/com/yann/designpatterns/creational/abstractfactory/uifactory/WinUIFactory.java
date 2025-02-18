package com.yann.designpatterns.creational.abstractfactory.uifactory;

import com.yann.designpatterns.creational.abstractfactory.Button;
import com.yann.designpatterns.creational.abstractfactory.Checkbox;
import com.yann.designpatterns.creational.abstractfactory.os.win.WinButton;
import com.yann.designpatterns.creational.abstractfactory.os.win.WinCheckbox;

public class WinUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
