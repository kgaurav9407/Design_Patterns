package org.example.Behavioural.Template.WithoutTemplate;

public class Coffee {
    public void prepareCoffee(){
        boilWater();
        addLeaves();
        pourInCup();
        addMilk();
    }

    private void boilWater(){
        System.out.println("Boiling Water");
    }

    private void addLeaves(){
        System.out.println("Adding Coffee Powder");
    }

    private void pourInCup(){
        System.out.println("Pouring into Cup");
    }

    private void addMilk(){
        System.out.println("Adding Milk");
    }
}
