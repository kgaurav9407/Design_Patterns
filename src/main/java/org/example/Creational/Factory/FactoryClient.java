package org.example.Creational.Factory;

import org.example.Creational.Factory.Interface.Payment;
import org.example.Creational.Factory.WithFactory.BasicFactory.PaymentFactory;

public class FactoryClient {
    public static void main(String args[]) {
        PaymentFactory factory = new PaymentFactory();
        Payment payment=factory.create("UPI");
        payment.pay("100");
    }
}
