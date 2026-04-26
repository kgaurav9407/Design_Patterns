package org.example.Behavioural.Template.WithTemplate;

public abstract class Beverage {
    public final void prepare(){
        boilWater();
        brew();
        pourInCup();
        addExtras();
    }
    private void boilWater(){
        System.out.println("Boiling Water");
    }

    private void pourInCup(){
        System.out.println("Pouring in Cup");
    }
    abstract void brew();
    abstract void addExtras();
}
