package com.yann.designpatterns.creational.abstractfactory.os.mac;

import com.yann.designpatterns.creational.abstractfactory.Checkbox;
import lombok.ToString;

@ToString
public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Mac Checkbox");
    }
}
