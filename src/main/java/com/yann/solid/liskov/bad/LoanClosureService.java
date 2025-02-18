package com.yann.solid.liskov.bad;

public class LoanClosureService {
    private LoanPayment loanPayment;

    public LoanClosureService(LoanPayment loanPayment) {
        this.loanPayment = loanPayment;
    }

    public void forCloseLoan() {
        loanPayment.foreCloseLoan();
    }
}
