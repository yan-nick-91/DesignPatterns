package com.yann.solid.liskov.good;

public class Main {
    public static void main(String[] args) {
        LoanPayment loanPayment = new CreditCardLoan();

        SecureLoan secureLoan = new HomeLoan();
        LoanClosureService loanClosureService = new LoanClosureService(secureLoan);

        loanClosureService.foreCloseLoan();
    }
}
