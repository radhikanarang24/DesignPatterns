package com.designpatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Subscriber> subscriberList;
    Group()
    {
        subscriberList=new ArrayList<>();
    }

    public void subscribe(Subscriber user)
    {
        subscriberList.add(user);
    }

    public void unsubscribe(Subscriber user)
    {
        subscriberList.remove(user);
    }

    public void notify(String msg)
    {
        for(Subscriber subscriber:subscriberList)
            subscriber.notify();
    }

}
