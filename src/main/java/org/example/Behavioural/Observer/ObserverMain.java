package org.example.Behavioural.Observer;

import org.example.Behavioural.Observer.WithObserver.EmailServiceObserver;
import org.example.Behavioural.Observer.WithObserver.Interface.NotificationObserver;
import org.example.Behavioural.Observer.WithObserver.OrderServiceWithObserver;
import org.example.Behavioural.Observer.WithObserver.PushNotificationServiceObserver;
import org.example.Behavioural.Observer.WithObserver.SMSServiceObserver;
import org.example.Behavioural.Observer.WithoutObserver.EmailServiceWithoutObserver;
import org.example.Behavioural.Observer.WithoutObserver.OrderServiceWithoutObserver;

public class ObserverMain {
    public static void main(String args[]){
        System.out.println("Without Observer\n");
        OrderServiceWithoutObserver orderServiceWithoutObserver=new OrderServiceWithoutObserver();
        orderServiceWithoutObserver.placeOrder("12345");

        System.out.println("\nWith Observer");

        OrderServiceWithObserver orderServiceWithObserver=new OrderServiceWithObserver();

        NotificationObserver email = new EmailServiceObserver();
        NotificationObserver sms = new SMSServiceObserver();
        NotificationObserver push = new PushNotificationServiceObserver();


        orderServiceWithObserver.addObserver(email);
        orderServiceWithObserver.addObserver(sms);
        orderServiceWithObserver.addObserver(push);

        orderServiceWithObserver.placeOrder("12345");
    }
}
