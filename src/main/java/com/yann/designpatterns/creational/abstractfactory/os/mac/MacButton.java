package com.yann.designpatterns.creational.abstractfactory.os.mac;

import com.yann.designpatterns.creational.abstractfactory.Button;
import lombok.ToString;

@ToString
public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
