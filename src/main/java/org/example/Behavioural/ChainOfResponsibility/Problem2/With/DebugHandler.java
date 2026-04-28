package org.example.Behavioural.ChainOfResponsibility.Problem2.With;

public class DebugHandler extends LogHandler{
    public DebugHandler(){
        this.level=2;
    }

    @Override
    public void write(String message){
        System.out.println("Debug: "+message);
    }
}
