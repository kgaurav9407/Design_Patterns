package org.example.Creational.AbstractFactory.Card;

import org.example.Creational.AbstractFactory.Interface.Payment;

public class CardPayment implements Payment {
    @Override
    public void pay(double amount){
        System.out.println("Paying "+amount+" via Card");
    }
}
