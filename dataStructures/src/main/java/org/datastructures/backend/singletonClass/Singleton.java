package org.datastructures.backend.singletonClass;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton(){
        System.out.println("Inside Singleton Class");
    }

    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
