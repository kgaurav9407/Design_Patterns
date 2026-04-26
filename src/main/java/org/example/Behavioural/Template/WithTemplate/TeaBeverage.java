package org.example.Behavioural.Template.WithTemplate;

public class TeaBeverage extends Beverage{
    @Override
    public void brew(){
        System.out.println("Adding Tea Leaves");
    }

    @Override
    public void addExtras(){
        System.out.println("Adding Sugar");
    }
}
