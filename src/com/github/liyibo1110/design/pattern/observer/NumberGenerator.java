package com.github.liyibo1110.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for(Observer ob : observers) {
            ob.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();
}
