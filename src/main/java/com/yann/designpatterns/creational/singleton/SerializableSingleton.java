package com.yann.designpatterns.creational.singleton;

import java.io.Serial;
import java.io.Serializable;

public class SerializableSingleton implements Serializable {
    private static SerializableSingleton instance = null;

    private SerializableSingleton() {

    }

    public static SerializableSingleton getInstance() {
        if (instance == null) {
            instance = new SerializableSingleton();
        }
        return instance;
    }

    /**
     * This is the key method that is responsible during a deserialization process.
     * This method gets invoked and simply returns an already created object.
     * @return Object
     */
    @Serial
    protected Object readResolve() {
        return instance;
    }
}
