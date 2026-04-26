package org.example.Structural.Adapter;

import org.example.Structural.Adapter.Interface.Notification;

public class EmailNotification implements Notification {
    public void send(String message){
        System.out.println("Sending Email "+message);
    }
}
