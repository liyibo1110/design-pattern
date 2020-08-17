package com.github.liyibo1110.design.pattern.interpreter;

public abstract class Node {

    public abstract void parse(Context context) throws ParseException;
}
