package com.yann.designpatterns.structural.bridge.video;

import com.yann.designpatterns.structural.bridge.processor.VideoProcessor;
import lombok.ToString;

@ToString
public class NetflixVideo extends Video {
    public NetflixVideo(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void play(String videoFile) {
        videoProcessor.process(videoFile);
    }
}
