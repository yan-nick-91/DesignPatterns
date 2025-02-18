package com.yann.designpatterns.structural.bridge.processor;

public class UHD4kProcessor implements VideoProcessor {
    @Override
    public void process(String videoFile) {
        System.out.printf("processing %s video file in Ultra HD 4K%n", videoFile);
    }
}
