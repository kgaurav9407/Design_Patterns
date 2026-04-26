package org.example.Creational.AbstractFactory.Card;

import org.example.Creational.AbstractFactory.Interface.Refund;

public class CardRefund implements Refund {
    @Override
    public void refund(double amount){
        System.out.println("Refunding "+amount+" via Card");
    }
}
