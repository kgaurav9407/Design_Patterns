package org.example.Behavioural.Strategy.WithStrategy;

public class WithPaymentService {
    private PaymentStrategy paymentStrategy;

    public WithPaymentService(PaymentStrategy paymentStrategy){

        this.paymentStrategy=paymentStrategy;
    }

    public void processPayment(double amount){
        paymentStrategy.validate();
        paymentStrategy.pay(amount);
    }
}
