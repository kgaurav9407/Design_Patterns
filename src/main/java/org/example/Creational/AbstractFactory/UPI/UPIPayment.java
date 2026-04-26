package org.example.Creational.AbstractFactory.UPI;


import org.example.Creational.AbstractFactory.Interface.Payment;

public class UPIPayment implements Payment {
    @Override
    public void pay(double amount){
        System.out.println("Paying "+amount+" via UPI");
    }
}
