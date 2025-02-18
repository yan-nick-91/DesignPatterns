package com.yann.designpatterns.structural.facade;

import lombok.Data;
import lombok.ToString;

@ToString
public class ZomatoFacade {
    private Restaurant restaurant = new Restaurant();
    private DeliveryBoy deliveryBoy = new DeliveryBoy();
    private DeliveryTeam deliveryTeam = new DeliveryTeam();

    public void placeOrder() {
        restaurant.prepareOrder();
        deliveryTeam.assignDeliveryBoy();
        deliveryBoy.pickUpOrder();
        deliveryBoy.deliverOrder();
    }
}
