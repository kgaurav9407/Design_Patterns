package org.example.Creational.Factory.WithFactory.BasicFactory;

import org.example.Creational.Factory.Implementation.CardPayment;
import org.example.Creational.Factory.Implementation.UPIPayment;
import org.example.Creational.Factory.Interface.Payment;

public class PaymentFactory {
    public Payment create(String type){
        Payment payment;
        if(type.equals("UPI"))
            payment=new UPIPayment();
        else if(type.equals("CREDIT CARD"))
            payment=new CardPayment();
        else
            throw new IllegalArgumentException("Unsupported payment type");
        return payment;
    }
}
