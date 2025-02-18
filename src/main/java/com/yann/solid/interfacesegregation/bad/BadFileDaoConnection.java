package com.yann.solid.interfacesegregation.bad;

public class BadFileDaoConnection implements BadDaoInterface {
    @Override
    public void openConnection() {
        /* Should not be able to open connection to the DB,
         * as this is not the class its responsibility.
         */
     }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {

    }

    @Override
    public void deleteRecord() {

    }
}
