package org.example.Behavioural.ChainOfResponsibility.Problem1.Without;

public class WithoutCOR {
    public void handleRequest(String issue){
        if(issue.equals("Basic")){
            System.out.println("Handled by team lead");
        } else if(issue.equals("Medium")){
            System.out.println("Handled by Manager");
        } else if(issue.equals("High")){
            System.out.println("Handled by Director");
        }
    }
}
