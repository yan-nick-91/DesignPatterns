package com.yann.designpatterns.behavioral.chainofresponsibility;

import lombok.Setter;

@Setter
public abstract class PaymentHandler {
    protected PaymentHandler next;

    public abstract void handlePayment(double amount);
}
