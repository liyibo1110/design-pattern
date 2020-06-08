package com.github.liyibo1110.design.pattern.iterator;

public interface Iterator<T> {

	public abstract boolean hasNext();

	public abstract T next();
}
