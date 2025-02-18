package com.yann.designpatterns.behavioral.command;

public class Main {
    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

        var result1 = textFileOperationExecutor.executeOperation(
                new OpenTextFileOperation(new TextFile("file1.text")));
        System.out.println(result1);

        var result2 = textFileOperationExecutor.executeOperation(
                new SaveTextFileOperation(new TextFile("file2.text")));
        System.out.println(result2);
    }
}
