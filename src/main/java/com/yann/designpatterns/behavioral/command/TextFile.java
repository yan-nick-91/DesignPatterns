package com.yann.designpatterns.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextFile {
    private String name;

    public String open() {
        return "Opening file " + name;
    }

    public String save() {
        return "Saving file " + name;
    }
}
