package com.bankmanagement;

import org.springframework.context.ApplicationEvent;

public class WithdrawEvent extends ApplicationEvent{
 double amt;
BankAccount acc;
	public WithdrawEvent(Object source,double amt,BankAccount acc) {
		
		super(source);
		System.out.println("Inside event");
		this.amt=amt;
		this.acc=acc;
	}
	
}