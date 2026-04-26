package org.example.Behavioural.Template.WithoutTemplate;

public class Tea {
    public void prepareTea(){
        boilWater();
        addLeaves();
        pourInCup();
        addSugar();
    }

    private void boilWater(){
        System.out.println("Boiling Water");
    }

    private void addLeaves(){
        System.out.println("Adding tea leaves");
    }

    private void pourInCup(){
        System.out.println("Pouring into Cup");
    }

    private void addSugar(){
        System.out.println("Adding Sugar");
    }
}
