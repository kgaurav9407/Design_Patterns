package org.example.Behavioural.Observer.WithObserver;

import org.example.Behavioural.Observer.WithObserver.Interface.NotificationObserver;

public class SMSServiceObserver implements NotificationObserver {
    @Override
    public void update(String message){
        System.out.println("Sending SMS "+message);
    }
}
