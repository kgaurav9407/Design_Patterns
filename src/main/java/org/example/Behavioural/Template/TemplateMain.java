package org.example.Behavioural.Template;

import org.example.Behavioural.Template.WithTemplate.CoffeeBeverage;
import org.example.Behavioural.Template.WithTemplate.TeaBeverage;
import org.example.Behavioural.Template.WithoutTemplate.Coffee;
import org.example.Behavioural.Template.WithoutTemplate.Tea;

public class TemplateMain {
    public static void main(String args[]){

        System.out.println("Without Template------");
        Tea tea=new Tea();
        tea.prepareTea();

        System.out.println("-------------");
        Coffee coffee=new Coffee();
        coffee.prepareCoffee();

        System.out.println("With Template------");

        TeaBeverage teaBeverage=new TeaBeverage();
        teaBeverage.prepare();
        System.out.println("-------------");

        CoffeeBeverage coffeeBeverage=new CoffeeBeverage();
        coffeeBeverage.prepare();

    }
}
