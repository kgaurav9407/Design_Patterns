package org.example.Behavioural.ChainOfResponsibility.Problem2.With;

public class InfoHandler extends LogHandler{
    public InfoHandler(){
        this.level=1;
    }

    @Override
    public void write(String message){
        System.out.println("Info: "+message);
    }
}
