package org.example.Creational.Singleton.DatabaseConnection.With;

import java.util.Map;
import java.util.HashMap;
// Here in case two thread comes simultaneously Instance will be NULL ,
// so two object will be created and two cache as well.
public class LazyInitialization {

    private static LazyInitialization INSTANCE;
    private Map<String,String> cache=new HashMap<>();

    private LazyInitialization(){
        System.out.println("Opening DB Connection Lazy");
        loadCache();
    }
    public static LazyInitialization getInstance(){
        if(INSTANCE==null){
            INSTANCE=new LazyInitialization();
        }
        return INSTANCE;
    }
    private void loadCache(){
        System.out.println("Loading data from db and updating in cache---");
        cache.put("db.url","localhost");
        cache.put("timeOut","30");
    }

    public String get(String key){
        return cache.get(key);
    }
}
