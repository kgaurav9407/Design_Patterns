package org.example.Behavioural.ChainOfResponsibility.Problem2.Without;

public class WithoutCOR {
    public void handleLog(int level,String message){
        if(level==1)
            System.out.println("Info: "+message);
        else if(level==2)
            System.out.println("Debug: "+message);
        else if(level==3)
            System.out.println("Error: "+message);
    }
}
