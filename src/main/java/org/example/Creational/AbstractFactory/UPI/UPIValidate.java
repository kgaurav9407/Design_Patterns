package org.example.Creational.AbstractFactory.UPI;

import org.example.Creational.AbstractFactory.Interface.Validator;

public class UPIValidate implements Validator {
    @Override
    public boolean validate(){
        System.out.println("Validating UPI Payment");
        return true;
    }
}
