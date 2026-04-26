package org.example.Behavioural.ChainOfResponsibility.Problem1.With;

public class Manager extends SupportHandler{
    public void handle(String issue){
        if(issue.equals("Medium")){
            System.out.println("Handled by Manager");
        }
        else if(next!=null){
            next.handle(issue);
        }
    }
}
