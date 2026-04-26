package org.example.Creational.AbstractFactory.UPI;

import org.example.Creational.AbstractFactory.Interface.Refund;

public class UPIRefund implements Refund {
    @Override
    public void refund(double amount){
        System.out.println("Refunding "+amount+" via UPI");
    }

}
