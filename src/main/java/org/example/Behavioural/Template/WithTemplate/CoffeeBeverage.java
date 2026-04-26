package org.example.Behavioural.Template.WithTemplate;

public class CoffeeBeverage extends Beverage{
    @Override
    public void brew(){
        System.out.println("Adding Coffee Powder");
    }

    @Override
    public void addExtras(){
        System.out.println("Adding Milk");
    }
}
