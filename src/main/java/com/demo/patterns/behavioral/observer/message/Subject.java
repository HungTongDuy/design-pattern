package com.demo.patterns.behavioral.observer.message;

public interface Subject {
    void attach(Observer ob);
    void detach(Observer ob);
    void notifyUpdate(Message m);
}
