package com.demo.patterns.behavioral.observer;

import com.demo.patterns.behavioral.observer.agency.NewsAgency;
import com.demo.patterns.behavioral.observer.agency.NewsChannel;
import com.demo.patterns.behavioral.observer.message.*;

public class ObserverExample {
    public static void main(String[] args) {
        System.out.println("===================== Agency =====================");
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("news");
//        assertEquals(observer.getNews(), "news");
        System.out.println("observer.getNews(): " + observer.getNews());


        System.out.println("===================== Message =====================");

        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessageSubscriberThree s3 = new MessageSubscriberThree();

        MessagePublisher p = new MessagePublisher();

        p.attach(s1);
        p.attach(s2);

        p.notifyUpdate(new Message("First Message"));   //s1 and s2 will receive the update

        p.detach(s1);
        p.attach(s3);

        p.notifyUpdate(new Message("Second Message")); //s2 and s3 will receive the update
    }
}
