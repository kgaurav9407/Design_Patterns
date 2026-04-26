package org.example.Behavioural.ChainOfResponsibility.Problem1.With;

public class TeamLead extends SupportHandler{
    public void handle(String issue){
        if(issue.equals("Basic")){
            System.out.println("Handled by team lead");
        } else if(next!=null){
            next.handle(issue);
        }
    }
}
