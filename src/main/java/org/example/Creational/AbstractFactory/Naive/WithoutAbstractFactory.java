package org.example.Creational.AbstractFactory.Naive;

import org.example.Creational.AbstractFactory.Card.CardPayment;
import org.example.Creational.AbstractFactory.Card.CardRefund;
import org.example.Creational.AbstractFactory.Card.CardValidate;
import org.example.Creational.AbstractFactory.Interface.Refund;
import org.example.Creational.AbstractFactory.Interface.Validator;
import org.example.Creational.AbstractFactory.UPI.UPIPayment;
import org.example.Creational.AbstractFactory.Interface.Payment;
import org.example.Creational.AbstractFactory.UPI.UPIRefund;
import org.example.Creational.AbstractFactory.UPI.UPIValidate;

public class WithoutAbstractFactory {
    public void processPayment(String type,double amount){
        if(type.equals("UPI")){
            Payment payment=new UPIPayment();
            Refund refund=new UPIRefund();
            Validator validator=new UPIValidate();

            if(validator.validate()){
                payment.pay(amount);
                refund.refund(100);
            }
        }
        else if(type.contains("Card")){
            Payment payment=new CardPayment();
            Refund refund=new CardRefund();
            Validator validator=new CardValidate();


            if(validator.validate()){
                payment.pay(amount);
                refund.refund(100);
            }
        }
        else{
            throw new IllegalArgumentException("Invalid payment type");
        }
    }
}
