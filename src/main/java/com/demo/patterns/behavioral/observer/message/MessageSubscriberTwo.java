package com.demo.patterns.behavioral.observer.message;

public class MessageSubscriberTwo implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberTwo: " + m);
    }
}
