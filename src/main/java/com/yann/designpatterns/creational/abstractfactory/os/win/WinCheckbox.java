package com.yann.designpatterns.creational.abstractfactory.os.win;

import com.yann.designpatterns.creational.abstractfactory.Checkbox;
import lombok.ToString;

@ToString
public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Win Checkbox");
    }
}
