package com.demo.patterns.structural.decorator.notify;

public class FacebookDecorator extends BaseNotifierDecorator {

    public FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        String fbName = "<Facebook Name>";
        System.out.println("Sending " + message + " on Facebook to " + fbName);
    }
}
