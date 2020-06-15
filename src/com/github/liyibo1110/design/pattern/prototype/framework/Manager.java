package com.github.liyibo1110.design.pattern.prototype.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product p = showcase.get(protoname);
        return p.createClone();
    }
}
