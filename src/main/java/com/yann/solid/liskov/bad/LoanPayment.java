package com.yann.solid.liskov.bad;

public interface LoanPayment {
    void doPayment(int amount);
    void foreCloseLoan();
    void doRepayment(int amount);

}
