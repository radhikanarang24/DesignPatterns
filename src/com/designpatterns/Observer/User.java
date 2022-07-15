package com.designpatterns.Observer;

public class User implements Subscriber{
    private int userId;
    User(int userId)
    {
        this.userId=userId;
    }
     @Override
    public void notify(String msg)
     {
         System.out.println("User "+userId+" recieved msg");
     }
}
