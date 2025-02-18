package com.yann.designpatterns.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OpenTextFileOperation implements TextFileOperation {
    private TextFile textFile;

    @Override
    public String execute() {
        return textFile.open();
    }
}
