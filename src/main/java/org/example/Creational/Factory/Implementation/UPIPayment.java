package org.example.Creational.Factory.Implementation;

import org.example.Creational.Factory.Interface.Payment;

public class UPIPayment implements Payment {
    @Override
    public void pay(String amount) {
        System.out.println("Payment done via UPI "+amount);
    }
}
