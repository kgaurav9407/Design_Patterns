package org.example.Creational.Singleton.DatabaseConnection.With;

import java.util.Map;
import java.util.HashMap;

public class SynchronizedSingleton {

    private static SynchronizedSingleton INSTANCE;
    private Map<String,String> cache=new HashMap<>();

    private SynchronizedSingleton(){
        loadCache();
    }

    public static synchronized SynchronizedSingleton getInstance(){
        if(INSTANCE==null){
            INSTANCE=new SynchronizedSingleton();
        }
        return INSTANCE;
    }
    private void loadCache(){
        System.out.println("Loading from db and updating the cache--");
        cache.put("db.url","localhost");
        cache.put("timeOut","30");
    }

    public String get(String key){
        return cache.get(key);
    }
}
