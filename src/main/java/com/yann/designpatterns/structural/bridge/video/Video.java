package com.yann.designpatterns.structural.bridge.video;

import com.yann.designpatterns.structural.bridge.processor.VideoProcessor;

public abstract class Video {
    protected VideoProcessor videoProcessor;

    protected Video(VideoProcessor videoProcessor) {
        this.videoProcessor = videoProcessor;
    }

    public abstract void play(String videoFile);
}
