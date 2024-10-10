package com.demo.patterns.behavioral.strategy.notification;

public class SMSNotifier implements NotifierStrategy {

    @Override
    public void send(String message) {
        System.out.println(String.format("Send SMS notification with message: %s", message));
    }
}
