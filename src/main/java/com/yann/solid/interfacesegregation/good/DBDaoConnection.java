package com.yann.solid.interfacesegregation.good;

public class DBDaoConnection implements DaoInterface, DBInterface {
    @Override
    public void openConnection() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }
}
