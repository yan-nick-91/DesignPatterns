package com.yann.solid.interfacesegregation.bad;

public class BadDBDaoConection implements BadDaoInterface{
    @Override
    public void openConnection() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {
        throw new UnsupportedOperationException("Open file not supported");
    }

    @Override
    public void deleteRecord() {

    }
}
