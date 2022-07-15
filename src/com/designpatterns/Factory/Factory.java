package com.designpatterns.Factory;

public class Factory {
    public static void main(String args[])
    {
        NotificationFactory factory=new NotificationFactory();
        Notification notification=factory.createNotification("SMS");
        notification.sendNotification();
    }
}
