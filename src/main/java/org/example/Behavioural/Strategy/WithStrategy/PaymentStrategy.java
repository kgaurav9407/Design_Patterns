package org.example.Behavioural.Strategy.WithStrategy;

public interface PaymentStrategy {
    void validate();
    void pay(double amount);
}
