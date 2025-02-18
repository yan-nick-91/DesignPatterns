package com.yann.solid.liskov.good;

public interface SecureLoan extends LoanPayment {
    void foreCloseLoan();
}
