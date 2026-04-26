package org.example.Behavioural.ChainOfResponsibility.Problem1.With;

public class Director extends SupportHandler{
    public void handle(String issue){
        if(issue.equals("High")){
            System.out.println("Handled by Director");
        }
        else {
            System.out.println("No one can handle this issue");
        }
    }
}
