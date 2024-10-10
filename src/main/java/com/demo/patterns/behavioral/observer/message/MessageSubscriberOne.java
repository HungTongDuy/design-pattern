package com.demo.patterns.behavioral.observer.message;

public class MessageSubscriberOne implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberOne: " + m);
    }
}
