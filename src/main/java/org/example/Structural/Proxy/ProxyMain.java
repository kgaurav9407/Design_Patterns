package org.example.Structural.Proxy;

import org.example.Structural.Proxy.WithProxy.Interface.Video;
import org.example.Structural.Proxy.WithProxy.ProxyVideo;
import org.example.Structural.Proxy.WithoutProxy.VideoServiceWithoutProxy;

public class ProxyMain {
    public static void main(String[] args) {
        System.out.println("Without Proxy:\n");
        VideoServiceWithoutProxy videoServiceWithoutProxy = new VideoServiceWithoutProxy();
        videoServiceWithoutProxy.loadVideo("movie.mp4");
        videoServiceWithoutProxy.loadVideo("movie.mp4");

        System.out.println("\nWith Proxy:\n");
        Video videoService=new ProxyVideo();
        videoService.loadVideo("movie.mp4");
        videoService.loadVideo("movie.mp4");
    }
}
