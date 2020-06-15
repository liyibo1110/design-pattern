package com.github.liyibo1110.design.pattern.prototype;

import com.github.liyibo1110.design.pattern.prototype.framework.Product;

public class UnderlinePen implements Product {

    private char underlineChar;

    public UnderlinePen(char underlineChar) {
        this.underlineChar = underlineChar;
    }

    @Override
    public void use(String str) {
        int length = str.getBytes().length;
        System.out.println("\"" + str + "\"");
        System.out.print(" ");
        for(int i = 0; i < length; i++) {
            System.out.print(underlineChar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
