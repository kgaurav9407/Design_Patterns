package org.example.Creational.Singleton.DatabaseConnection.Without;

import java.util.Map;
import java.util.HashMap;

public class WithoutSingleton {
    private Map<String,String> cache=new HashMap<>();
    public WithoutSingleton(){
        System.out.println("Opening db Connection");
        loadCache();
    }

    public void loadCache(){
        System.out.println("Loading Config from db and updating cache");
        cache.put("db.url","localhost");
        cache.put("timeOut","30");
    }
    public String get(String key){
        return cache.get(key);
    }
}
