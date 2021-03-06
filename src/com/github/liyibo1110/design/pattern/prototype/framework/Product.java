package com.github.liyibo1110.design.pattern.prototype.framework;

public interface Product extends Cloneable {

    public abstract void use(String str);

    public abstract Product createClone();
}
