package com.github.liyibo1110.design.pattern.composite;

import com.github.liyibo1110.design.pattern.builder.Director;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {

    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        // 合成器模式的核心，利用递归
        int size = 0;
        for(Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        // 合成器模式的核心，利用递归
        System.out.println(prefix + "/" + this);
        for(Entry entry : directory) {
            entry.printList(prefix + "/" + name);
        }
    }
}
