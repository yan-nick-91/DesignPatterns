package com.yann.designpatterns.structural.bridge;

import com.yann.designpatterns.structural.bridge.processor.HDProcessor;
import com.yann.designpatterns.structural.bridge.processor.UHD4kProcessor;
import com.yann.designpatterns.structural.bridge.video.NetflixVideo;
import com.yann.designpatterns.structural.bridge.video.Video;
import com.yann.designpatterns.structural.bridge.video.YoutubeVideo;

public class Main {
    public static void main(String[] args) {
        Video youtubeVideo = new YoutubeVideo(new HDProcessor());
        System.out.println(youtubeVideo);
        youtubeVideo.play("abc.mp4");

        Video netflixVideo = new NetflixVideo(new UHD4kProcessor());
        System.out.println(netflixVideo);
        netflixVideo.play("cba.mp4");
    }
}
