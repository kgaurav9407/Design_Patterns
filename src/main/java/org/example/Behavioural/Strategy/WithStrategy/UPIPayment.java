package org.example.Behavioural.Strategy.WithStrategy;

public class UPIPayment implements PaymentStrategy{
    public void validate(){
        System.out.println("Validating UPI Payment");
    }

    public void pay(double amount){
        System.out.println("Processing UPI payment of amount "+amount);
    }
}
