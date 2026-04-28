package org.example.Behavioural.ChainOfResponsibility.Problem2;

import org.example.Behavioural.ChainOfResponsibility.Problem2.With.DebugHandler;
import org.example.Behavioural.ChainOfResponsibility.Problem2.With.ErrorHandler;
import org.example.Behavioural.ChainOfResponsibility.Problem2.With.InfoHandler;
import org.example.Behavioural.ChainOfResponsibility.Problem2.With.LogHandler;
import org.example.Behavioural.ChainOfResponsibility.Problem2.Without.WithoutCOR;

public class CORMain {
    public static void main() {
        WithoutCOR withoutCOR=new WithoutCOR();
        withoutCOR.handleLog(2,"This is a debug message");

        LogHandler chain=new InfoHandler();
        chain.setNext(new DebugHandler()).setNext(new ErrorHandler());

        chain.log(1,"This is an info message");
        chain.log(3,"This is an error message");
    }
}
