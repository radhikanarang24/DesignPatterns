package com.designpatterns.Factory;

public class NotificationFactory {
    public Notification createNotification(String type){
        if(type.isBlank()) return null;

        switch (type)
        {
            case "SMS":
                return new SMSNotification();
            case "Email":
                return new EmailNotification();
            default:
                throw new IllegalArgumentException("Unkown Type");

        }
    }
}
