package com.designpatterns.Factory;

public class EmailNotification implements Notification{

    @Override
    public void sendNotification(){
        System.out.println("Sending Email Notification");
    }
}
