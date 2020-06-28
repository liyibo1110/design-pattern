package com.github.liyibo1110.design.pattern.factorymethod;

import com.github.liyibo1110.design.pattern.factorymethod.framework.Factory;
import com.github.liyibo1110.design.pattern.factorymethod.framework.Product;
import com.github.liyibo1110.design.pattern.factorymethod.idcard.IdCardFactory;

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
