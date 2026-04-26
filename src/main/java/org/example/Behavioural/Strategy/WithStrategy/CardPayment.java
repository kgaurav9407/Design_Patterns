package org.example.Behavioural.Strategy.WithStrategy;

public class CardPayment implements PaymentStrategy{
    @Override
    public void validate(){
        System.out.println("Validating Card Payment");
    }

    @Override
    public void pay(double amount){
        System.out.println("Processing Card payment of amount "+amount);
    }
}
