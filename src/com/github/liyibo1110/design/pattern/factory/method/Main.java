package com.github.liyibo1110.design.pattern.factory.method;

import com.github.liyibo1110.design.pattern.factory.method.framework.Factory;
import com.github.liyibo1110.design.pattern.factory.method.framework.Product;
import com.github.liyibo1110.design.pattern.factory.method.idcard.IdCardFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IdCardFactory();
        Product card1 = factory.create("A");
        Product card2 = factory.create("B");
        Product card3 = factory.create("C");
        card1.use();
        card2.use();
        card3.use();
    }
}
