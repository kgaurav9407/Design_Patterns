package org.example.Creational.Singleton.DatabaseConnection.With;

import java.util.HashMap;
import java.util.Map;
public enum ENUMSingleton {
    INSTANCE;

    private Map<String,String> cache;

    ENUMSingleton(){
        System.out.println("Opening DB Connection ENUM Singleton");
        cache=new HashMap<>();
        loadCache();
    }

    private void loadCache(){
        System.out.println("Loading from db and updating the cache");
        cache.put("db.url","localhost");
        cache.put("timeOut","30");
    }
    public String get(String key){
        return cache.get(key);
    }
}
