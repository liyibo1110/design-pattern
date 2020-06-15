package com.github.liyibo1110.design.pattern.prototype;

import com.github.liyibo1110.design.pattern.prototype.framework.Manager;
import com.github.liyibo1110.design.pattern.prototype.framework.Product;

public class Main {

    public static void main(String[] args) {

        // ready
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('-');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // create
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}
