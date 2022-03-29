package com.bankmanagement;

abstract class BankAccount {
    private String accNum;
    private String accHolder;
    private double accBalance;

     BankAccount(String accNum, String accHolder) {
        this.accNum = accNum;
        this.accHolder = accHolder;
        this.accBalance=1000;
    }

    BankAccount(String accNum, String accHolder, double accBalance) {
        this.accNum = accNum;
        this.accHolder = accHolder;
        this.accBalance = accBalance;
    }
    abstract double withdraw(double amt);
    abstract double deposit(double amt);

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public void showBalance() {
        System.out.println(this.accBalance);
    }

    @Override
    public String toString() {
        return "BankAccount [accBalance=" + accBalance + ", accHolder=" + accHolder + ", accNum=" + accNum + "]";
    }

    
    
}
