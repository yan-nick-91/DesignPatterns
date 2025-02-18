package com.yann.designpatterns.structural.facade;

public class DeliveryBoy {
    public void pickUpOrder() {
        System.out.println("Order picked up by assigned delivery boy");
    }

    public void deliverOrder() {
        System.out.println("Order delivered");
    }
}
