package org.example.Behavioural.Observer.WithoutObserver;

public class OrderServiceWithoutObserver {
    private EmailServiceWithoutObserver emailServiceWithoutObserver=new EmailServiceWithoutObserver();
    private SMSServiceWithoutObserver smsServiceWithoutObserver=new SMSServiceWithoutObserver();
    private PushNotificationServiceWithoutObserver pushNotificationServiceWithoutObserver=new PushNotificationServiceWithoutObserver();

    public void placeOrder(String orderId){
        System.out.println("Placing order "+orderId);

        emailServiceWithoutObserver.sendEmail("Order "+orderId+" placed successfully");
        smsServiceWithoutObserver.sendSms("Order "+orderId+" placed successfully");
        pushNotificationServiceWithoutObserver.sendPush("Order "+orderId+" placed successfully");
    }
}
