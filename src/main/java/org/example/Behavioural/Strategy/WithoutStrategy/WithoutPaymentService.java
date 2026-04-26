package org.example.Behavioural.Strategy.WithoutStrategy;

public class WithoutPaymentService {
    public void pay(String type,double amount){
        if(type.equals("UPI")){
            System.out.println("Validating UPI....");
            System.out.println("Processing UPI payment of amount "+amount);
        }
        else if(type.equals("CARD")){
            System.out.println("Validating Card....");
            System.out.println("Processing Card payment of amount "+amount);
        }

        else if(type.equals("NetBanking")){
            System.out.println("Validating Netbanking....");
            System.out.println("Processing Netbanking payment of amount "+amount);
        }
        else{
            throw new IllegalArgumentException("Invalid payment type");
        }
    }
}
