package com.github.liyibo1110.design.pattern.factory.method.idcard;

import com.github.liyibo1110.design.pattern.factory.method.framework.Product;

public class IdCard extends Product {

    private String owner;

    public IdCard(String owner) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
