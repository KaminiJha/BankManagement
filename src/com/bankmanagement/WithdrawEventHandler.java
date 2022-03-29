package com.bankmanagement;

import org.springframework.context.ApplicationListener;

public class WithdrawEventHandler implements ApplicationListener<WithdrawEvent> {
	public void sendSms()
	{
		System.out.println("Withdraw happend");
	}
	public void onApplicationEvent(WithdrawEvent event) {
		System.out.println("Inside handler");
		sendSms();
		System.out.println("Cuurent balance is "+event.acc.getAccBalance());
	}
}