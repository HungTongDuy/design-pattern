package com.demo.patterns.behavioral.strategy.notification;

import com.demo.patterns.DemoApplication;
import org.springframework.boot.SpringApplication;

public class NotificationExample {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);

        NotifierContext notifierContextEmail = new NotifierContext(new EmailNotifier());
        notifierContextEmail.sendNotification("email content");

        NotifierContext notifierContextSMS = new NotifierContext(new SMSNotifier());
        notifierContextSMS.sendNotification("sms message");
    }
}
