package com.yann.solid.singleresponsibility;

import java.util.HashMap;
import java.util.Map;

public class AccountOperations {
    private static final Map<Integer, Account> accountMap = new HashMap<>();

    public void addAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public void updateAccount (Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public Account getAccount(int accountNumber) {
        return accountMap.get(accountNumber);
    }

    /* This method should not be part of AccountOperations,
     * as this class is only responsible for operations for accounts.
     * Since the method deposit has another responsibility, like saving money,
     * it should be placed into another class that operates on the same
     * responsibility.
     *
     * Hence, adding this method in this class violates the
     * Single Responsibility Principle, and therefore a new class should be created
     * for this method (see TransactionOperations).
     */
    public void deposit( int amount, int accountNumber) {

    }
}
