package org.example.Behavioural.ChainOfResponsibility.Problem2.With;

public class ErrorHandler extends LogHandler{
    public ErrorHandler(){
        this.level=3;
    }

    @Override
    public void write(String message){
        System.out.println("Error: "+message);
    }
}
