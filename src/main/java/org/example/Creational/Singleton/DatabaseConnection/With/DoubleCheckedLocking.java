package org.example.Creational.Singleton.DatabaseConnection.With;

import java.util.Map;
import java.util.HashMap;

public class DoubleCheckedLocking {

    private static volatile DoubleCheckedLocking INSTANCE;
    private Map<String,String> cache=new HashMap<>();

    private DoubleCheckedLocking(){
        System.out.println("Opening db connection Double Checked Locking Singleton");
        loadCache();
    }
    public static DoubleCheckedLocking getInstance(){
        if(INSTANCE==null){
            synchronized (DoubleCheckedLocking.class){
                if(INSTANCE==null){
                    INSTANCE=new DoubleCheckedLocking();
                }
            }
        }
        return INSTANCE;
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
