package org.example.Behavioural.Observer.WithObserver;

import org.example.Behavioural.Observer.WithObserver.Interface.NotificationObserver;
import org.example.Behavioural.Observer.WithObserver.Interface.Subject;

import java.util.List;
import java.util.ArrayList;

public class OrderServiceWithObserver implements Subject {
    private List<NotificationObserver> observers=new ArrayList<>();

    @Override
    public void addObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for(NotificationObserver observer:observers){
            observer.update(message);
        }
    }

    public void placeOrder(String message){
        System.out.println("Placing order "+message);
        notifyObservers(message);
    }
}
