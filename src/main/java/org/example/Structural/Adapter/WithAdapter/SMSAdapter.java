package org.example.Structural.Adapter.WithAdapter;

import org.example.Structural.Adapter.Interface.LegacyNotification;
import org.example.Structural.Adapter.Interface.Notification;

public class SMSAdapter implements Notification {
    private  LegacyNotification legacyNotification;
    public SMSAdapter(LegacyNotification legacyNotification){
        this.legacyNotification=legacyNotification;
    }

    @Override
    public void send(String message){
        legacyNotification.pushMessage(message);
    }
}
