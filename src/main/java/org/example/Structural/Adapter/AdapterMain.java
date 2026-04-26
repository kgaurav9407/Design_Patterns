package org.example.Structural.Adapter;

import org.example.Structural.Adapter.Interface.LegacyNotification;
import org.example.Structural.Adapter.Interface.Notification;
import org.example.Structural.Adapter.WithAdapter.NotificationService;
import org.example.Structural.Adapter.WithAdapter.SMSAdapter;
import org.example.Structural.Adapter.WithoutAdapter.LegacySMSNotification;
import org.example.Structural.Adapter.WithoutAdapter.WithoutAdapter;

public class AdapterMain {
    public static void main(String args[]){
//        WithoutAdapter withoutNotifcationService = new WithoutAdapter();
//        withoutNotifcationService.notifyUser("EMAIL","Hello Email");
//        withoutNotifcationService.notifyUser("SMS","Hello SMS");

        NotificationService notificationService = new NotificationService();
        Notification emailNotification = new EmailNotification();
        notificationService.notifyUser(emailNotification,"Hello Email");

        LegacyNotification legacyNotification=new LegacySMSNotification();
        Notification sms=new SMSAdapter(legacyNotification);
        notificationService.notifyUser(sms,"Hello SMS");
    }
}
