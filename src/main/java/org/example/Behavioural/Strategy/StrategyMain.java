package org.example.Behavioural.Strategy;

import org.example.Behavioural.Strategy.WithStrategy.CardPayment;
import org.example.Behavioural.Strategy.WithStrategy.UPIPayment;
import org.example.Behavioural.Strategy.WithStrategy.WithPaymentService;
import org.example.Behavioural.Strategy.WithoutStrategy.WithoutPaymentService;

public class StrategyMain {
    public static void main(String args[]){
        WithoutPaymentService withoutPaymentService = new WithoutPaymentService();
        withoutPaymentService.pay("UPI",100);
        withoutPaymentService.pay("CARD",200);

        WithPaymentService UPI=new WithPaymentService(new UPIPayment());
        UPI.processPayment(1000);

        WithPaymentService card=new WithPaymentService(new CardPayment());
        card.processPayment(2000);
    }
}
