package com.yann.designpatterns.creational.abstractfactory;

import com.yann.designpatterns.creational.abstractfactory.uifactory.UIFactory;
import lombok.ToString;

@ToString
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(UIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        this.button.paint();
        this.checkbox.paint();
    }
}
