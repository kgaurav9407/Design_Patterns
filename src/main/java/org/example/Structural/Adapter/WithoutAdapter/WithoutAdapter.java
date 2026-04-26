package org.example.Structural.Adapter.WithoutAdapter;

import org.example.Structural.Adapter.EmailNotification;
import org.example.Structural.Adapter.Interface.LegacyNotification;
import org.example.Structural.Adapter.Interface.Notification;

public class WithoutAdapter {
    public void notifyUser(String type,String message){
        if(type.equals("EMAIL")){
            Notification emailNotification = new EmailNotification();
            emailNotification.send(message);
        }
        else if(type.equals("SMS")){
            LegacyNotification smsNotification = new LegacySMSNotification();
            smsNotification.pushMessage(message);
        }
        else{
            throw new IllegalArgumentException("Unsupported notification type");
        }
    }
}
