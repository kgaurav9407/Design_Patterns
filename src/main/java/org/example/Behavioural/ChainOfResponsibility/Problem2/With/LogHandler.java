package org.example.Behavioural.ChainOfResponsibility.Problem2.With;

public abstract class LogHandler {
    protected LogHandler nextHandler;
    protected int level;

    public LogHandler setNext(LogHandler next){
        this.nextHandler=next;
        return next;
    }

    abstract public void write(String message);

    public void log(int level,String message){
        if(this.level==level){
            write(message);
        }
        else if(nextHandler!=null){
            nextHandler.log(level,message);
        }
        else{
            System.out.println("No Handler found for this level: "+level);
        }
    }
}
