package com.github.liyibo1110.design.pattern.visitor;

public abstract class Visitor {

    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
