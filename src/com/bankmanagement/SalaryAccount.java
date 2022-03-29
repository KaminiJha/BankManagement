package com.bankmanagement;

public class SalaryAccount extends BankAccount {

    public SalaryAccount(String accNum, String accHolder) {
        super(accNum, accHolder);
    }

    public SalaryAccount(String accNum, String accHolder, double accBalance) {
        super(accNum, accHolder, accBalance);
    }

    public double withdraw(double amt) {
        if (amt < 100000) {
            if (getAccBalance() < amt) {
                System.out.println("insufficiant amt");
                return getAccBalance();
            } else {
                double amtRem = getAccBalance() - amt;
                setBalance(amtRem);
                return amtRem;
            }
        } else {
            System.out.println("withdraw imit exceeded ");
            return getAccBalance();
        }
    }

    public double deposit(double amt) {
        double newAmt = getAccBalance() + amt;
        setBalance(newAmt);
        return newAmt;
    }

}
