package org.example.Behavioural.ChainOfResponsibility.Problem1;

import org.example.Behavioural.ChainOfResponsibility.Problem1.With.Director;
import org.example.Behavioural.ChainOfResponsibility.Problem1.With.Manager;
import org.example.Behavioural.ChainOfResponsibility.Problem1.With.SupportHandler;
import org.example.Behavioural.ChainOfResponsibility.Problem1.With.TeamLead;
import org.example.Behavioural.ChainOfResponsibility.Problem1.Without.WithoutCOR;

public class CORMain {
    public static void main(String args[]){
        WithoutCOR withoutCOR=new WithoutCOR();
        withoutCOR.handleRequest("Medium");

        System.out.println("---------------------");
        SupportHandler tl=new TeamLead();
        SupportHandler mgr=new Manager();
        SupportHandler dir=new Director();

        tl.setNext(mgr);
        mgr.setNext(dir);

        tl.handle("Basic");
        tl.handle("Medium");
        tl.handle("Critical");
    }
}
