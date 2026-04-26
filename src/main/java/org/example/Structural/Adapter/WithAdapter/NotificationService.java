package org.example.Structural.Adapter.WithAdapter;

import org.example.Structural.Adapter.Interface.Notification;

public class NotificationService {
    public void notifyUser(Notification notification,String message){
        notification.send(message);
    }
}
