package org.example.Structural.Proxy.WithProxy;

import org.example.Structural.Proxy.WithProxy.Interface.Video;

public class RealVideoService implements Video {
    @Override
    public void loadVideo(String videoName){
        System.out.println("Loading video from server "+videoName);
    }
}
