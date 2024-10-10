package com.demo.patterns.structural.decorator.notify;

public class InstagramDecorator extends BaseNotifierDecorator {

    public InstagramDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        String fbName = "<Instagram Name>";
        System.out.println("Sending " + message + " on Instagram to " + fbName);
    }
}
