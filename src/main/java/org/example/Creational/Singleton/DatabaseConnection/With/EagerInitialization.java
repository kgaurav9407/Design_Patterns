package org.example.Creational.Singleton.DatabaseConnection.With;

import java.util.Map;
import java.util.HashMap;

public class EagerInitialization {
    private Map<String,String> cache= new HashMap<>();
    public static int x = 10;
    private static final EagerInitialization INSTANCE=new EagerInitialization();

    private EagerInitialization(){
        System.out.println("Opening database connection");
        loadCache();
    }

    public static EagerInitialization getInstance(){
        System.out.println("Static Method loaded");
        return INSTANCE;
    }

    private void loadCache(){
        System.out.println("Loading config from db and updating the cache");
        cache.put("db.url","localhost");
        cache.put("timeOut","30");
    }
    public String get(String key){
        return cache.get(key);
    }
}
