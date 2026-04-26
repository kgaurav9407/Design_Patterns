package org.example.Structural.Adapter.WithoutAdapter;

import org.example.Structural.Adapter.Interface.LegacyNotification;

public class LegacySMSNotification implements LegacyNotification {
    @Override
    public void pushMessage(String message){
        System.out.println("Pushing SMS via Legacy System"+message);
    }
}
