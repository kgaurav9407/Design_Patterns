package org.example.Creational.Factory.WithoutFactory;

import org.example.Creational.Factory.Implementation.CardPayment;
import org.example.Creational.Factory.Implementation.UPIPayment;
import org.example.Creational.Factory.Interface.Payment;

public class WithoutFactoryClient {
    public static void main(String args[]){
        String type="UPI";
        Payment payment;
        if(type.equals("UPI"))
            payment=new UPIPayment();
        else if(type.equals("Credit Card"))
            payment=new CardPayment();
        else
            throw new IllegalArgumentException("Unsupported payment type");
        payment.pay("100");
    }
}
