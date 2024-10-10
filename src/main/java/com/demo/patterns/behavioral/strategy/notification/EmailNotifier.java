package com.demo.patterns.behavioral.strategy.notification;

public class EmailNotifier implements NotifierStrategy {
    @Override
    public void send(String message) {
        System.out.println(String.format("Send Email notification with message: %s", message));
    }
}
