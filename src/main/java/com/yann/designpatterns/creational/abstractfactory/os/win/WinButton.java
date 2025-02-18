package com.yann.designpatterns.creational.abstractfactory.os.win;

import com.yann.designpatterns.creational.abstractfactory.Button;
import lombok.ToString;

@ToString
public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
