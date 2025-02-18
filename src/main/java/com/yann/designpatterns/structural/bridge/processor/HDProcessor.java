package com.yann.designpatterns.structural.bridge.processor;

public class HDProcessor implements VideoProcessor {
    @Override
    public void process(String videoFile) {
        System.out.printf("processing %s video file in HD%n", videoFile);
    }
}
