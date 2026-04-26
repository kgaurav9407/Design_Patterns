package org.example.Creational.AbstractFactory;

import org.example.Creational.AbstractFactory.Naive.WithoutAbstractFactory;

public class WithoutAbstractMain {
    public static void main(String args[]){
        WithoutAbstractFactory withoutAbstractFactory = new WithoutAbstractFactory();
        withoutAbstractFactory.processPayment("CreditCard",1000.0);
    }
}
