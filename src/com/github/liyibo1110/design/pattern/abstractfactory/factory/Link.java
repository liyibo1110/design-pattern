package com.github.liyibo1110.design.pattern.abstractfactory.factory;

public abstract class Link extends Item {

    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
