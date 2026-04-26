package org.example.Creational.AbstractFactory.Card;

import org.example.Creational.AbstractFactory.Interface.Validator;

public class CardValidate implements Validator {
    @Override
    public boolean validate(){
        System.out.println("Validating payment from Card");
        return true;
    }
}
