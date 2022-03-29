package com.bankmanagement;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class WithdrawEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
    	System.out.println("Inside publisher");
        this.publisher = publisher;
    }

    public void publish(double amt,BankAccount acc) {
        WithdrawEvent event = new WithdrawEvent(this,amt,acc);
        this.publisher.publishEvent(event);
    }
}
