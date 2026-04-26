package org.example.Creational.Singleton.DatabaseConnection.With;

import java.util.HashMap;
import java.util.Map;

public class BillPughSingleton {
    private Map<String,String> cache=new HashMap<>();

    private BillPughSingleton(){
        System.out.println("Opening DB Connection Bill Pugh Singleton");
        loadCache();
    }

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE=new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return  SingletonHelper.INSTANCE;
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
