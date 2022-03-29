package com.bankmanagement;

import com.bankmanagement.SavingsAccount;
import com.bankmanagement.WithdrawEventPublisher;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        BankAccount savingsAcc=(SavingsAccount)context.getBean("savingsAccount");
        WithdrawEventPublisher publisher=(WithdrawEventPublisher)context.getBean("withdrawPublisher");
        savingsAcc.withdraw(345);
        publisher.publish(345,savingsAcc);
    }
}
