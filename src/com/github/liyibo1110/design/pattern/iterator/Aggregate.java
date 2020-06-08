package com.github.liyibo1110.design.pattern.iterator;

@FunctionalInterface
public interface Aggregate {

	public abstract Iterator<?> iterator();
}
