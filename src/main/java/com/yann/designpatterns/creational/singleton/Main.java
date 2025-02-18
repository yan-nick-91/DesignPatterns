package com.yann.designpatterns.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        exampleSerialization();
        exampleReflection();
    }

    private static void exampleSerialization() throws IOException, ClassNotFoundException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
//        objectOutputStream.writeObject(lazySingleton);
//        objectOutputStream.close();
//
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
//        LazySingleton deserializedLazy = (LazySingleton) objectInputStream.readObject();
//        objectInputStream.close();
//        System.out.println("Object 1 :" + lazySingleton.hashCode());
//        System.out.println("Object 2 :" + deserializedLazy.hashCode());

        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(serializableSingleton);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        SerializableSingleton deserializeSingleton = (SerializableSingleton) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("Object 1 :" + serializableSingleton.hashCode());
        System.out.println("Object 2 :" + deserializeSingleton.hashCode());
    }

    private static void exampleReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);

        LazySingleton lazySingleton = (LazySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println("Reflected hashcode singleton: " + lazySingleton.hashCode());
        System.out.println("Singleton instance: " + instance.hashCode());

        EnumSingleton.INSTANCE.doSomething();
    }
}
