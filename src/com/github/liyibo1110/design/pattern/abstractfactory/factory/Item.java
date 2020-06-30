package com.github.liyibo1110.design.pattern.abstractfactory.factory;

public abstract class Item {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
