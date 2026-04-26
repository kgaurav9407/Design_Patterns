package org.example.Creational.Singleton.DatabaseConnection;

import org.example.Creational.Singleton.DatabaseConnection.With.*;
import org.example.Creational.Singleton.DatabaseConnection.Without.WithoutSingleton;


public class SingletonMain {
    public static void main(String args[]){
//        WithoutSingleton config1=new WithoutSingleton();
//        WithoutSingleton config2=new WithoutSingleton();
//
//        System.out.println(config1.get("db.url"));
//        System.out.println(config2.get("timeOut"));

//        EagerInitialization withconfig1=EagerInitialization.getInstance();
//        EagerInitialization withconfig2=EagerInitialization.getInstance();
//
//        System.out.println(withconfig1.get("db.url"));
//        System.out.println(withconfig2.get("timeOut"));

//        LazyInitialization withlazy1=LazyInitialization.getInstance();
//        LazyInitialization withlazy2=LazyInitialization.getInstance();
//
//        System.out.println(withlazy1.get("db.url"));
//        System.out.println(withlazy2.get("timeOut"));

//        SynchronizedSingleton withsync1=SynchronizedSingleton.getInstance();
//        SynchronizedSingleton withsync2=SynchronizedSingleton.getInstance();
//
//        System.out.println(withsync1.get("db.url"));
//        System.out.println(withsync2.get("timeOut"));

//        DoubleCheckedLocking withdouble1=DoubleCheckedLocking.getInstance();
//        DoubleCheckedLocking withdouble2=DoubleCheckedLocking.getInstance();
//
//        System.out.println(withdouble1.get("db.url"));
//        System.out.println(withdouble2.get("timeOut"));

//        BillPughSingleton withbillpugh1=BillPughSingleton.getInstance();
//        BillPughSingleton withbillpugh2=BillPughSingleton.getInstance();
//
//        System.out.println(withbillpugh1.get("db.url"));
//        System.out.println(withbillpugh2.get("timeout"));

//        String url = ENUMSingleton.INSTANCE.get("db.url");
//        System.out.println(url);
//
//        String timeout = ENUMSingleton.INSTANCE.get("timeOut");
//        System.out.println(timeout);
//        System.out.println("Application started");
//
//        System.out.println(EagerInitialization.x);
//        // We NEVER use ConfigManager
//        doSomething();
//
//        System.out.println("Application finished");

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " calling getInstance()");
            LazyInitialization instance = LazyInitialization.getInstance();
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
    static void doSomething() {
        System.out.println("Doing some unrelated work...");
    }

}
