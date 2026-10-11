package org.example.Behavioural.ChainOfResponsibility.Problem1_SupportTicket.With;

public abstract class SupportHandler {
    protected SupportHandler next;

    public void setNext(SupportHandler next){
        this.next=next;
    }
    public abstract void handle(String issue);
}
