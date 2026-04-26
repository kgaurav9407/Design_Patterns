package org.example.Structural.Proxy.WithProxy;

import org.example.Structural.Proxy.WithProxy.Interface.Video;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideo implements Video {
    private RealVideoService realVideoService=new RealVideoService();
    private Map<String,String> cache=new HashMap<>();

    @Override
    public void loadVideo(String videoName){
        if(cache.containsKey(videoName)){
            System.out.println("Loading video from cache "+videoName);
        }
        else{
            realVideoService.loadVideo(videoName);
            cache.put(videoName,videoName);
        }
    }
}
