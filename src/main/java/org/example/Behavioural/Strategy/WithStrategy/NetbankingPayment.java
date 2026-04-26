package org.example.Behavioural.Strategy.WithStrategy;

public class NetbankingPayment implements PaymentStrategy{
    @Override
    public void validate(){
        System.out.println("Validating Netbanking Payment");
    }

    @Override
    public void pay(double amount){
        System.out.println("Processing Netbanking payment of amount "+amount);
    }


}
