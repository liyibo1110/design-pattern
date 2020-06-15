package com.github.liyibo1110.design.pattern.singleton;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static final Singleton getInstance() {
        return instance;
    }
}
