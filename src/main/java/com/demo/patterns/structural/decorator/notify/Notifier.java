package com.demo.patterns.structural.decorator.notify;

public class Notifier implements INotifier {
    private final String username;

    public Notifier(String username) {
        this.username = username;
    }

    @Override
    public void send(String message) {
        String mail = "<email>";
        System.out.println("Sending " + message + " by Mail to " + mail);
    }

    @Override
    public String getUsername() {
        return username;
    }
}
