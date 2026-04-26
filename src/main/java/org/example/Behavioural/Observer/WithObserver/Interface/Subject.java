package org.example.Behavioural.Observer.WithObserver.Interface;

public interface Subject {
    void addObserver(NotificationObserver observer);
    void removeObserver(NotificationObserver observer);
    void notifyObservers(String message);
}
