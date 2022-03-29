package com.bankmanagement;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accNum, String accHolder) {
        super(accNum, accHolder);
    }

    public SavingsAccount(String accNum, String accHolder, double accBalance) {
        super(accNum, accHolder, accBalance);
    }

    public double withdraw(double amt) {
        if (amt < 30000) {
            if (getAccBalance() < amt) {
                System.out.println("insufficiant amt");
                return getAccBalance();
            } else {
                double amtRem = getAccBalance() - amt;
                setBalance(amtRem);
                return amtRem;
            }
        } else {
            System.out.println("withdraw limit exceeded ");
            return getAccBalance();
        }
    }

    public double deposit(double amt) {
        if (amt <= 1000000) {
            double newAmt = getAccBalance() + amt;
            setBalance(newAmt);
            return newAmt;
        } else {
            System.out.println("Deposit limit exceeded");
            return getAccBalance();
        }

    }

}
