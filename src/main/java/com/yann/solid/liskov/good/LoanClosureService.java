package com.yann.solid.liskov.good;

public class LoanClosureService {
    private SecureLoan secureLoan;

    public LoanClosureService(SecureLoan secureLoan) {
        this.secureLoan = secureLoan;
    }

    public void foreCloseLoan() {
        secureLoan.foreCloseLoan();
    }

    public void doPayment(int amount) {
        secureLoan.doPayment(amount);
    }
}
