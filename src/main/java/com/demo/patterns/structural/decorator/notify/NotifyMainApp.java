package com.demo.patterns.structural.decorator.notify;

public class NotifyMainApp {

    public static void main(String[] args) {
        INotifier facebookNotifier = new FacebookDecorator(new Notifier("test user"));
        facebookNotifier.send("test message");

        System.out.println("=========================================");

        INotifier instagramNotifier = new InstagramDecorator(new Notifier("test user 2"));
        instagramNotifier.send("test message 2");
    }
}
