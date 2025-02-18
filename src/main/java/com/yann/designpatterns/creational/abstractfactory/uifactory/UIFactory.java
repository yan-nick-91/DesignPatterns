package com.yann.designpatterns.creational.abstractfactory.uifactory;

import com.yann.designpatterns.creational.abstractfactory.Button;
import com.yann.designpatterns.creational.abstractfactory.Checkbox;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
