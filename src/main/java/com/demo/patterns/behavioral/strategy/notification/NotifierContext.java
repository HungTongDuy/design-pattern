package com.demo.patterns.behavioral.strategy.notification;

public class NotifierContext {
    private NotifierStrategy notifierStrategy;

    public NotifierContext(NotifierStrategy notifierStrategy) {
        this.notifierStrategy = notifierStrategy;
    }

    public void sendNotification(String message) {
        notifierStrategy.send(message);
    }

}
