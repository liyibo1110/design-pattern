package com.github.liyibo1110.design.pattern.decorator;

public abstract class Border extends Display {

    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
